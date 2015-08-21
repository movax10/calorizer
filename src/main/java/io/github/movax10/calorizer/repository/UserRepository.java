package io.github.movax10.calorizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.movax10.calorizer.model.User;

/**
 * @author Roman Voloboev
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
