package com.example.kzad4.flyweight.non.generic.strategy;

import com.example.kzad4.flyweight.model.FileType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class GeneratorStrategy {

    @Getter
    private final FileType fileType;

    public abstract byte[] generate();
}
