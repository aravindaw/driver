package com.github.aravinda;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface DriverSettings {
    DriverSet.OS OS() default DriverSet.OS.MAC;

    public DriverSet.WINDOW_SIZE WINDOW_SIZE() default DriverSet.WINDOW_SIZE.MAXIMIZE;

    public String BASE_URL() default "";

    public int IMPLICIT_WAIT() default 0;

}
