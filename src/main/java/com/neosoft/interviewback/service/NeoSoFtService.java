package com.neosoft.interviewback.service;

import org.springframework.stereotype.Service;

import static java.util.stream.Collectors.joining;

@Service
public class NeoSoFtService {

    private static final String NEO = "Neo";
    private static final String SO = "So";
    private static final String FT = "Ft";

    public String convertNumber(int inputNumber) {
        var result = new StringBuilder();

        result.append(replaceWhenDividable(inputNumber, 3, NEO));
        result.append(replaceWhenDividable(inputNumber, 5, SO));
        result.append(replaceWhenContains(inputNumber));

        return result.isEmpty() ? String.valueOf(inputNumber) : result.toString();
    }

    private String replaceWhenContains(int inputNumber) {
        return String.valueOf(inputNumber)
                .chars()
                .mapToObj(c -> (char) c)
                .map(c -> switch (c) {
                    case '3' -> NEO;
                    case '5' -> SO;
                    case '7' -> FT;
                    default -> "";
                })
                .collect(joining());
    }

    private String replaceWhenDividable(int inputNumber, int divisor, String replacement) {
        return (inputNumber % divisor == 0) ? replacement : "";
    }
}
