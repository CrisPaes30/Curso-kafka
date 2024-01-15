package com.cristian.paes.strconsumer.custom;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaListener;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@KafkaListener(
        topics = "str-topic",
        containerFactory = "strContainerFactory"
)
public @interface StrConsumerCustomListener {
    String groupId() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "errorHandler")
    String errorHandler() default "errorCustomHandler";
}
