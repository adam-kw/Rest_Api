package com.example.app.controller;

import com.example.app.flyweight.generic.GenericFactory;
import com.example.app.flyweight.generic.strategy.generator.GeneratorGenericStrategy;
import com.example.app.flyweight.model.FileType;
import com.example.app.flyweight.nongeneric.GeneratorFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/files")
@RequiredArgsConstructor
public class FileController {
    private final GeneratorFactory generatorFactory;
    private final GenericFactory<FileType, GeneratorGenericStrategy> genericFactory;

    @GetMapping
    void generateFile(@RequestParam FileType fileType) {
        generatorFactory.getGeneratorStrategy(fileType).generate();
    }

    @GetMapping("/generic")
    void generateGenericFile(@RequestParam FileType fileType) {
        genericFactory.getStrategy(fileType).generate();
    }

}
