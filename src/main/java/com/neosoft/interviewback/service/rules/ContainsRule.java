package com.neosoft.interviewback.service.rules;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class ContainsRule implements Rule {

    @Override
    public String applyOn(int inputNumber) {
        var figures = split(inputNumber);
        return Stream.of(figures)
                .map(Integer::parseInt)
                .map(i -> switch (i) {
                    case 3 -> "Neo";
                    case 5 -> "So";
                    case 7 -> "Ft";
                    default -> "";
                })
                .collect(joining());
    }

    private String[] split(int input) {
        return String.valueOf(input).split("");
    }
}
