package com.example.kzad4.flyweight.non.generic.strategy;

import com.example.kzad4.flyweight.model.FileType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class XlsGenerator extends GeneratorStrategy{

    public XlsGenerator() {
        super(FileType.XLS);
    }

    @Override
    public byte[] generate() {
        log.info("xls");
        return new byte[0];
    }
}
