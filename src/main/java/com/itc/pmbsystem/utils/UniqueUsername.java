package com.itc.pmbsystem.utils;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UniqueUsernameValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueUsername {

    String message() default "Username tersebut sudah digunakan";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
