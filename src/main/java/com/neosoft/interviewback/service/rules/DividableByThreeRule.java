package com.neosoft.interviewback.service.rules;

public class DividableByThreeRule implements Rule {

    Rule dividableByThree = new DividableRule(3, NEO);

    @Override
    public String applyOn(int input) {
        return dividableByThree.applyOn(input);
    }
}
