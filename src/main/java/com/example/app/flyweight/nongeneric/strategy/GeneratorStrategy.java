package com.example.app.flyweight.nongeneric.strategy;

import com.example.app.flyweight.model.FileType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class GeneratorStrategy {

    @Getter
    private final FileType fileType;

    public abstract byte[] generate();
}
