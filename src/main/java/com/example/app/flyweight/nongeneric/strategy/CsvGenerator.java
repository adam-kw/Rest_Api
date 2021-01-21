package com.example.app.flyweight.nongeneric.strategy;

import com.example.app.flyweight.model.FileType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CsvGenerator extends GeneratorStrategy{

    public CsvGenerator() {
        super(FileType.CSV);
    }

    @Override
    public byte[] generate() {
        log.info("csv");
        return new byte[0];
    }
}
