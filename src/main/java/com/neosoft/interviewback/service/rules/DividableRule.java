package com.neosoft.interviewback.service.rules;


record DividableRule(int divisor, String replacement) implements Rule {

    @Override
    public String applyOn(int input) {
        return (input % divisor == 0) ? replacement : "";
    }
}
