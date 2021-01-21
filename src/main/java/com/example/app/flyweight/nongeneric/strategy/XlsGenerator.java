package com.example.app.flyweight.nongeneric.strategy;

import com.example.app.flyweight.model.FileType;
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
