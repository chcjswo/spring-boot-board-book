package com.mocadev.springbootboard.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-01-24
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
