package io.github.movax10.calorizer.model;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Roman Voloboev
 */
public class Customer {
    private Integer id;

    @NotNull(message = "Email can't be null")
    @Size(max = 200, message = "Incorrect email size")
    @Email(message = "Incorrect email format")
    private String email;

    @NotNull(message = "Password can't be null")
    @Size(max = 50, message = "Incorrect password size")
    private String password;

    public Customer() {
    }

    public Customer(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
