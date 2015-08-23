package io.github.movax10.calorizer.service;

import javax.servlet.http.HttpServletRequest;

import io.github.movax10.calorizer.dto.JsonResponseDTO;
import io.github.movax10.calorizer.model.Customer;

/**
 * @author Roman Voloboev
 */
public interface CustomerService {
    Customer selectModel(String email);
    void save(Customer customer) throws Exception;
    JsonResponseDTO registerCustomer(Customer customer, HttpServletRequest request) throws Exception;
}
