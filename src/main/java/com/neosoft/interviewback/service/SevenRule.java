package com.neosoft.interviewback.service;

public class SevenRule implements Rule {
    @Override
    public String applyOn(int input) {
        if (String.valueOf(input).contains("7")) {
            return "Ft";
        }
        return "";
    }
}
