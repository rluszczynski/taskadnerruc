package com.test.adnerruc.service;

import com.test.adnerruc.domain.model.CaseEntity;
import com.test.adnerruc.domain.repository.CaseRepository;
import com.test.adnerruc.domain.type.CaseState;
import com.test.adnerruc.domain.type.CaseType;
import com.test.adnerruc.response.CaseFilterResponse;
import com.test.adnerruc.validators.RequestValidator;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CaseService {

    CaseRepository caseRepository;
    RequestValidator requestValidator;

    public CaseFilterResponse getFilteredCases(String from, String to, String caseType) {

        requestValidator.requestCaseFilterValidator(from, to, caseType);

        List<CaseEntity> cases = caseRepository.findByDateOfEntryBetweenAndCaseType(LocalDate.parse(from), LocalDate.parse(to), CaseType.valueOf(caseType));
        Map<CaseState, Long> countCases = cases.stream().collect(Collectors.groupingBy(CaseEntity::getCaseState, Collectors.counting()));
        return CaseFilterResponse.builder()
                .caseTypeCount(countCases)
                .build();
    }
}
