package com.example.kzad4.flyweight.non.generic.strategy;

import com.example.kzad4.flyweight.model.FileType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PdfGenerator extends GeneratorStrategy{

    public PdfGenerator() {
        super(FileType.PDF);
    }

    @Override
    public byte[] generate() {
        log.info("pdf");
        return new byte[0];
    }
}
