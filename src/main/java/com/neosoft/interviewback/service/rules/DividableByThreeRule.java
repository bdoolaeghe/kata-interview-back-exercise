package com.neosoft.interviewback.service.rules;

import static com.neosoft.interviewback.service.rules.Rule.NEO;

public class DividableByThreeRule implements Rule {

    Rule dividableByThree = new DividableRule(3, NEO);

    @Override
    public String applyOn(int input) {
        return dividableByThree.applyOn(input);
    }
}
