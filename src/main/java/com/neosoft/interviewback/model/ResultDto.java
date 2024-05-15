package com.neosoft.interviewback.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResultDto {
    private int numberToConvert;
    private String result;
}
