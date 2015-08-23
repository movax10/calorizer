package io.github.movax10.calorizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ValidationException;

import io.github.movax10.calorizer.dto.JsonResponseDTO;
import io.github.movax10.calorizer.model.Customer;
import io.github.movax10.calorizer.service.CustomerService;

/**
 * @author Roman Voloboev
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * Registers customer by sending JSON object to /customer/sign_up URL.
     * @param customer - Customer JSON object. Required fields: email, password.
     * @param request - Clients request. Needs for auto login after registration.
     * @return JsonResponseDTO
     */
    @PreAuthorize("isAnonymous()")
    @RequestMapping(value = "/customer/sign_up", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseDTO registerCustomer(@RequestBody Customer customer, HttpServletRequest request) {
        try {
            return customerService.registerCustomer(customer, request);
        } catch (ValidationException e) {
            return new JsonResponseDTO("error", "Validation error");
        }
        catch (Exception e) {
            return new JsonResponseDTO("error", "Some another error");
        }
    }
}
