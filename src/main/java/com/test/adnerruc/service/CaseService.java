package com.test.adnerruc.service;

import com.test.adnerruc.domain.model.CaseEntity;
import com.test.adnerruc.domain.repository.CaseRepository;
import com.test.adnerruc.domain.type.CaseState;
import com.test.adnerruc.domain.type.CaseType;
import com.test.adnerruc.response.CaseFilterResponse;
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

    public CaseFilterResponse getFilteredCases(LocalDate from, LocalDate to, CaseType caseType) {
        List<CaseEntity> cases = caseRepository.findByDateOfEntryBetweenAndCaseType(from, to, caseType);
        Map<CaseState, Long> countCases = cases.stream().collect(Collectors.groupingBy(CaseEntity::getCaseState, Collectors.counting()));
        System.out.println(countCases);
        return CaseFilterResponse.builder()
                .caseTypeCount(countCases)
                .build();
    }
}
