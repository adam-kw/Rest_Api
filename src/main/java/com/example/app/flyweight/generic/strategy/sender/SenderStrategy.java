package com.example.app.flyweight.generic.strategy.sender;

import com.example.app.flyweight.generic.strategy.GenericStrategy;
import com.example.app.flyweight.model.MailType;

public interface SenderStrategy extends GenericStrategy<MailType> {
    void send();
}
