package com.example.app.flyweight.generic.strategy.generator;

import com.example.app.flyweight.generic.strategy.GenericStrategy;
import com.example.app.flyweight.model.FileType;

public interface GeneratorGenericStrategy extends GenericStrategy<FileType> {
    byte[] generate();
}
