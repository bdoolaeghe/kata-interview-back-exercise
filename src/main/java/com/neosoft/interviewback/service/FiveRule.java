package com.neosoft.interviewback.service;

public class FiveRule implements Rule {

    public static final String FIVE = "5";

    @Override
    public String applyOn(int input) {
        StringBuilder result = new StringBuilder("");
        if (input % 5 == 0) {
            result.append("So");
        }

        var inputString = String.valueOf(input);
        if (inputString.contains(FIVE)) {
            int occurences = inputString.length() - inputString.replace(FIVE, "").length();
            for (int i = 0; i < occurences; i++) {
                result.append("So");
            }
        }

        return result.toString();
    }
}
