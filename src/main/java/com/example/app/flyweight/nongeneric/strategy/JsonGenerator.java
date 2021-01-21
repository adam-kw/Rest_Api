package com.example.app.flyweight.nongeneric.strategy;

import com.example.app.flyweight.model.FileType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class JsonGenerator extends GeneratorStrategy{

    public JsonGenerator() {
        super(FileType.JSON);
    }

    @Override
    public byte[] generate() {
        log.info("json");
        return new byte[0];
    }
}
