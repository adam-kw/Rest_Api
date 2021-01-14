package com.example.kzad4.flyweight.non.generic.strategy;

import com.example.kzad4.flyweight.model.FileType;
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
