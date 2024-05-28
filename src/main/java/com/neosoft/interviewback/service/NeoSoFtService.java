package com.neosoft.interviewback.service;

import com.neosoft.interviewback.service.rules.*;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.neosoft.interviewback.service.rules.NoopRule.keepAsIs;
import static java.util.stream.Collectors.joining;
import static org.apache.logging.log4j.util.Strings.isEmpty;

@Service
public class NeoSoFtService {

    List<Rule> rules = List.of(
            new DividableByThreeRule(),
            new DividableByFiveRule(),
            new ContainsRule()
    );

    public String convertNumber(int inputNumber) {
        var result = rules.stream()
                .map(rule -> rule.applyOn(inputNumber))
                .collect(joining());
        return isEmpty(result)
                ? keepAsIs(inputNumber)
                : result;
    }

}
