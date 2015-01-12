package com.sevan.hellospring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name empty");
        Person person = (Person) object;
        if (person.getAge() < 0) {
            errors.rejectValue("age", "illegal age value");
        } else if (person.getAge() > 120) {
            errors.rejectValue("age", "r u sure this man's alive?");
        }
    }

}
