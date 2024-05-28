package com.neosoft.interviewback.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Integer.parseInt;
import static org.assertj.core.api.Assertions.assertThat;

class NeoSoFtServiceTest {

    NeoSoFtService neoSoFtService = new NeoSoFtService();

    @ParameterizedTest
    @CsvSource(value = {
        "1,1",
        "3,NeoNeo",
        "5,SoSo",
        "7,Ft",
        "9,Neo",
        "51,NeoSo",
        "53,SoNeo",
        "33,NeoNeoNeo",
        "27,NeoFt",
        "15,NeoSoSo",
        "357075357,NeoNeoSoFtFtSoNeoSoFt"
    })
    void should_validate_test_harness(String input,String expectedOutput) {
        assertThat(neoSoFtService.convertNumber(parseInt(input))).isEqualTo(expectedOutput);
    }
}