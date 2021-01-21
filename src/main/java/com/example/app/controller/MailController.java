package com.example.app.controller;

import com.example.app.flyweight.generic.GenericFactory;
import com.example.app.flyweight.generic.strategy.sender.SenderStrategy;
import com.example.app.flyweight.model.MailType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mails")
@RequiredArgsConstructor
public class MailController {
    private final GenericFactory<MailType, SenderStrategy> genericFactory;

    @GetMapping
    void generateGenericMail(@RequestParam MailType mailType){
        genericFactory.getStrategy(mailType).send();
    }
}
