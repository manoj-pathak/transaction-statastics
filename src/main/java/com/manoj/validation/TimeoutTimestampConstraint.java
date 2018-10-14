package com.manoj.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = TimeoutTimestampValidator.class)
@Target({ METHOD, FIELD })
@Retention(RUNTIME)
public @interface TimeoutTimestampConstraint {
	String message() default "Transaction is timed out";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
