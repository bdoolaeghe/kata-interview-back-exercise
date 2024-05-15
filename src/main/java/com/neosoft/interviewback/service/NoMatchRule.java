package com.neosoft.interviewback.service;

public class NoMatchRule implements Rule {
    @Override
    public String applyOn(int input) {
        return String.valueOf(input);
    }
}
