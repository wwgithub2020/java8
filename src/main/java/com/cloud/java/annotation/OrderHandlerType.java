package com.cloud.java.annotation;

/**
 * @Description: OrderHandlerType
 * @Version 1.0.0
 */
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface OrderHandlerType {
    String source();
}
