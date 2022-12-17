package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

public interface ConstraintValidator {
    @Documented
    @Constraint(validatedBy = PidConstraintValidator.class)
    @Target( { ElementType.METHOD, ElementType.FIELD })
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Pid {

        String message() default "Incorrect PID";
        Class<?>[] groups() default {};   
        Class<? extends Payload>[] payload() default {};

    }
}