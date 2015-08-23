package io.github.movax10.calorizer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

import io.github.movax10.calorizer.dto.JsonResponseDTO;
import io.github.movax10.calorizer.model.Customer;
import io.github.movax10.calorizer.repository.CustomerRepository;

/**
 * @author Roman Voloboev
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private BeanValidator beanValidator;
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Transactional(readOnly = true)
    @Override
    public Customer selectModel(String email) {
        return customerRepository.getByEmailIgnoreCase(email);
    }

    @Transactional
    @Override
    public void save(Customer customer) throws Exception {
        if (beanValidator.validate(customer)) {
            customerRepository.save(customer);
        }
    }

    @Override
    public JsonResponseDTO registerCustomer(Customer customer, HttpServletRequest request) throws Exception {
        if (selectModel(customer.getEmail()) != null) {
            return new JsonResponseDTO("error", "Account already exists");
        } else {
            save(customer);            
            authorizeCustomer(customer, request);
            return new JsonResponseDTO("success", "Account successfully registered");
        }
    }

    private void authorizeCustomer(Customer customer, HttpServletRequest request) throws Exception {
        UserDetails user = authenticationService.loadUserByUsername(customer.getEmail());
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
        request.getSession();
        token.setDetails(new WebAuthenticationDetails(request));
        Authentication authentication = authenticationManager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

}
