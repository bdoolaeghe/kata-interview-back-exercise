package com.neosoft.interviewback.controller;

import com.neosoft.interviewback.model.ResultDto;
import com.neosoft.interviewback.service.NeoSoFtService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/neo-so-ft")
@RequiredArgsConstructor
public class NeoSoFtController {

    private final NeoSoFtService neoSoFtService;

    @GetMapping("/{inputNumber}")
    public ResultDto convertNumber(@PathVariable("inputNumber") int inputNumber) {
        return ResultDto.builder()
                .numberToConvert(inputNumber)
                .result(neoSoFtService.convertNumber(inputNumber))
                .build();
    }
}
