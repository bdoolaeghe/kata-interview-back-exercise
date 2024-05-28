package com.neosoft.interviewback.service.rules;

public class DividableByThreeRule implements Rule {

    @Override
    public String applyOn(int input) {
        return  (input % 3 == 0)  ? "Neo" : "";
    }
}
