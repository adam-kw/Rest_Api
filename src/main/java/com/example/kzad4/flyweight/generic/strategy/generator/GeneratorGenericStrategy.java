package com.example.kzad4.flyweight.generic.strategy.generator;

import com.example.kzad4.flyweight.generic.strategy.GenericStrategy;
import com.example.kzad4.flyweight.model.FileType;

public interface GeneratorGenericStrategy extends GenericStrategy<FileType> {
    byte[] generate();
}
