package com.neosoft.interviewback.service;

public class ThreeRule implements Rule {

    public static final String THREE = "3";

    @Override
    public String applyOn(int input) {
        StringBuilder result = new StringBuilder("");
        if (input % 3 == 0) {
            result.append("Neo");
        }

        var inputString = String.valueOf(input);
        if (inputString.contains(THREE)) {
            int occurences = inputString.length() - inputString.replace(THREE, "").length();
            for (int i = 0; i < occurences; i++) {
                result.append("Neo");
            }
        }

        return result.toString();
    }
}
