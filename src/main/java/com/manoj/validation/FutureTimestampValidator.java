package com.manoj.validation;

import static java.time.ZoneOffset.UTC;
import static java.time.temporal.ChronoUnit.MILLIS;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FutureTimestampValidator implements ConstraintValidator<FutureTimestampConstraint, ZonedDateTime> {
    @Override
    public void initialize(final FutureTimestampConstraint constraintAnnotation) {
    }

    /**
     * Validate with accuracy up to millis
     */
    @Override
    public boolean isValid(final ZonedDateTime timestampField, final ConstraintValidatorContext context) {
        ZonedDateTime currentZonedDateTime = OffsetDateTime.now(UTC).toZonedDateTime();
        long diff = MILLIS.between(timestampField, currentZonedDateTime);
        return diff >= 0;
    }
}
