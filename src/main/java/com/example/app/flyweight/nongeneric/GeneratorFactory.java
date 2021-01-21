package com.example.app.flyweight.nongeneric;

import com.example.app.flyweight.model.FileType;
import com.example.app.flyweight.nongeneric.strategy.GeneratorStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class GeneratorFactory {

    private final List<GeneratorStrategy> strategies;
    private Map<FileType, GeneratorStrategy> strategyMap;

    @PostConstruct
    void init(){
        strategyMap = strategies.stream()
                .collect(Collectors.toMap(GeneratorStrategy::getFileType, Function.identity()));
    }

    public GeneratorStrategy getGeneratorStrategy(FileType fileType){
        return strategyMap.get(fileType);
    }
}
