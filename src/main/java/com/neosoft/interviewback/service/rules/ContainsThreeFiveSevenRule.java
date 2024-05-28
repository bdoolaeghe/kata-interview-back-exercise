package com.neosoft.interviewback.service.rules;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class ContainsThreeFiveSevenRule implements Rule {

    @Override
    public String applyOn(int inputNumber) {
        var figures = split(inputNumber);
        return Stream.of(figures)
                .map(Integer::parseInt)
                .map(i -> switch (i) {
                    case 3 -> NEO;
                    case 5 -> SO;
                    case 7 -> FT;
                    default -> "";
                })
                .collect(joining());
    }

    private String[] split(int input) {
        return String.valueOf(input).split("");
    }
}
