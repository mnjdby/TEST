package com.fullerton.olp.settings.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation that check the uniqueness of mobile
 */
@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = { UniqueMobileValidator.class })
public @interface UniqueMobile {

    String message();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
