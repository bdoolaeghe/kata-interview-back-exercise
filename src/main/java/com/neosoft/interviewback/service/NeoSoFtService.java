package com.neosoft.interviewback.service;

import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class NeoSoFtService {

    public String convertNumber(int inputNumber) {
        var result = new StringBuilder();
        if (inputNumber % 3 == 0) {
            result.append("Neo");
        }
        if (inputNumber % 5 == 0) {
            result.append("So");
        }
        var content = String.valueOf(inputNumber).split("");
        Stream.of(content).forEach(c -> {
                    var mapping = switch (c) {
                        case "3" -> "Neo";
                        case "5" -> "So";
                        case "7" -> "Ft";
                        default -> "";
                    };
                    result.append(mapping);
                }
        );
        return result.isEmpty() ? String.valueOf(inputNumber) : result.toString();
    }
}
