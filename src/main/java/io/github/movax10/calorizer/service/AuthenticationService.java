package io.github.movax10.calorizer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.github.movax10.calorizer.model.Customer;

/**
 * @author Roman Voloboev
 */
@Service("authenticationService")
public class AuthenticationService implements UserDetailsService {
    private static final Logger LOGGER = Logger.getLogger(AuthenticationService.class.getName());

    @Autowired
    private CustomerService customerService;

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer customer = customerService.selectModel(email);
        if (customer != null) {
            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new User(customer.getEmail(), customer.getPassword(), authorities);
        } else {
            LOGGER.log(Level.SEVERE, "Customer " + email + " not found");
            throw new UsernameNotFoundException("Customer not found");
        }
    }
}
