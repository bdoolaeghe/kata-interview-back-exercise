package com.neosoft.interviewback.service;

import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class NeoSoFtService {

    public static final String NEO = "Neo";
    public static final String SO = "So";
    public static final String FT = "Ft";

    public String convertNumber(int inputNumber) {
        var result = new StringBuilder();

        result.append(replaceWhenDivisible(inputNumber, 3, NEO));
        result.append(replaceWhenDivisible(inputNumber, 5, SO));

        var content = String.valueOf(inputNumber).split("");
        Stream.of(content).forEach(c -> result.append(switch (c) {
                    case "3" -> NEO;
                    case "5" -> SO;
                    case "7" -> FT;
                    default -> "";
                })
        );
        return result.isEmpty() ? String.valueOf(inputNumber) : result.toString();
    }

    private String replaceWhenDivisible(int inputNumber, int divisor, String replacement) {
        return (inputNumber % divisor == 0) ? replacement : "";
    }
}
