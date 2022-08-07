package com.mmutawe.explore.custom.validation.customvalidationdemo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

@Target( { FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = UserIdValidator.class)
public @interface UserIdValidation {

    public String message() default "User id must be a positive number";

    public  Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
