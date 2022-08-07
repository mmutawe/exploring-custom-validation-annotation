package com.mmutawe.explore.custom.validation.customvalidationdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserPhoneValidator implements ConstraintValidator<UserPhoneValidation, String> {

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {

        try {
            Integer.parseInt(phoneNumber);
        } catch (Exception ex){
            return false;
        }
        return true;
    }
}
