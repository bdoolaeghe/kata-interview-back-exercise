package com.neosoft.interviewback.service.rules;

public class DividableByFiveRule implements Rule {

    Rule dividableByFive = new DividableRule(5, SO);

    @Override
    public String applyOn(int input) {
        return dividableByFive.applyOn(input);
    }
}
