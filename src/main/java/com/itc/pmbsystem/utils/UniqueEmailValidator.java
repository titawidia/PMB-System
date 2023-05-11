package com.itc.pmbsystem.utils;

import itc.fundraising.domain.donor.DonorRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    private final DonorRepository donorRepository;

    public UniqueEmailValidator(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (donorRepository == null) {
            return true;
        }
        return donorRepository.findByEmail(email) == null;
    }

}
