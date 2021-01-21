package com.example.app.flyweight.generic.strategy.sender.impl;

import com.example.app.flyweight.generic.strategy.sender.SenderStrategy;
import com.example.app.flyweight.model.MailType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GeneratorNewsletter implements SenderStrategy {
    @Override
    public MailType getType() {
        return MailType.NEWSLETTER;
    }

    @Override
    public void send() {
        log.info("newsletter");
    }
}
