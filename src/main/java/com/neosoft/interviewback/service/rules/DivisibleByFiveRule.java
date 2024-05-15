package com.neosoft.interviewback.service.rules;

public class DivisibleByFiveRule implements Rule {

    @Override
    public String applyOn(int input) {
        return (input % 5 == 0) ? "So" : "";
    }
}
