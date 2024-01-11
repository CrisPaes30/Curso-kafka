package com.cristian.paes.strconsumer.custom;

import org.springframework.kafka.annotation.KafkaListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@KafkaListener(
        topics = "str-topic",
        containerFactory = "strContainerFactory"
)
public @interface StrConsumerCustomListener {
    String groupId() default "";
}
