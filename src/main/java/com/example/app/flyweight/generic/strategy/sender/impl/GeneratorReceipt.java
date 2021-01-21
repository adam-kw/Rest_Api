package com.example.app.flyweight.generic.strategy.sender.impl;

import com.example.app.flyweight.generic.strategy.sender.SenderStrategy;
import com.example.app.flyweight.model.MailType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GeneratorReceipt implements SenderStrategy {
    @Override
    public MailType getType() {
        return MailType.RECEIPT;
    }

    @Override
    public void send() {
        log.info("receipt");
    }
}
