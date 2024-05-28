package com.neosoft.interviewback.service;

import org.springframework.stereotype.Service;

import static java.util.stream.Collectors.joining;

@Service
public class NeoSoFtService {

    public static final String NEO = "Neo";
    public static final String SO = "So";
    public static final String FT = "Ft";

    public String convertNumber(int inputNumber) {
        var result = new StringBuilder();

        result.append(replaceWhenDivisible(inputNumber, 3, NEO));
        result.append(replaceWhenDivisible(inputNumber, 5, SO));
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

    private String replaceWhenDivisible(int inputNumber, int divisor, String replacement) {
        return (inputNumber % divisor == 0) ? replacement : "";
    }
}
