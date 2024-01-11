package com.cristian.paes.strconsumer.listeners;

import com.cristian.paes.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class StrConsumerListener {
    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message){
        log.info("Create ::: Receive message {}", message);

    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void log(String message){
        log.info("Log ::: Receive message {}", message);

    }

    @StrConsumerCustomListener(groupId = "group-2")
    public void history(String message){
        log.info("History ::: Receive message {}", message);

    }
}
