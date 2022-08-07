package com.mmutawe.explore.custom.validation.customvalidationdemo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

@Target( { FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = UserPhoneValidator.class)
public @interface UserPhoneValidation {
    public String message() default "User phone must be a positive number";

    public  Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
