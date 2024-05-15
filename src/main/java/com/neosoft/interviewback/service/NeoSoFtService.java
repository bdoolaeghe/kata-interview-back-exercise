package com.neosoft.interviewback.service;

import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;

@Service
public class NeoSoFtService {

    List<Rule> rules = List.of(
            new ThreeRule(),
            new FiveRule(),
            new SevenRule()
    );

    NoMatchRule noMatchRule = new NoMatchRule();

    public String convertNumber(int inputNumber) {
        var result = rules.stream()
                .map(r -> r.applyOn(inputNumber))
                .collect(joining());
        return "".equals(result)
                ? noMatchRule.applyOn(inputNumber)
                : result;
    }
}
