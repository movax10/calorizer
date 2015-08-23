package io.github.movax10.calorizer.service;

import org.springframework.stereotype.Component;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidationException;
import javax.validation.Validator;

/**
 * @author Roman Voloboev
 */
@Component
public class BeanValidator {
    private Validator validator;

    @PostConstruct
    public void initializeValidator() throws Exception {
        validator = Validation.buildDefaultValidatorFactory().usingContext().getValidator();
    }

    public boolean validate(Object object) throws ValidationException {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object);
        if (constraintViolations.size() > 0) {
            StringBuilder errorString = new StringBuilder();
            for (ConstraintViolation<Object> cv : constraintViolations) {
                errorString.append(String.format("Format error in property: [%s], value: [%s], message: [%s]",
                        cv.getPropertyPath(), cv.getInvalidValue(), cv.getMessage()));
            }
            throw new ValidationException(errorString.toString());
        }
        return true;
    }
}
