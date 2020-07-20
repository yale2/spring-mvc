package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * @author yale
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Security {

    String[] values() default "";
}
