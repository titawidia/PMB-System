package com.itc.pmbsystem.utils;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UniqueEmailValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmail {

    String message() default "Email tersebut sudah digunakan";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
