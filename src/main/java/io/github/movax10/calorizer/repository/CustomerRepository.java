package io.github.movax10.calorizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.movax10.calorizer.model.Customer;

/**
 * @author Roman Voloboev
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer getByEmailIgnoreCase(String email);
}
