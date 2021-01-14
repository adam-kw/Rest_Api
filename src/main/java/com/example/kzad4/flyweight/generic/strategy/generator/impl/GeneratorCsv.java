package com.example.kzad4.flyweight.generic.strategy.generator.impl;

import com.example.kzad4.flyweight.generic.strategy.generator.GeneratorGenericStrategy;
import com.example.kzad4.flyweight.model.FileType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GeneratorCsv implements GeneratorGenericStrategy {

    @Override
    public FileType getType() {
        return FileType.CSV;
    }

    @Override
    public byte[] generate() {
        log.info("csv");
        return new byte[0];
    }
}
