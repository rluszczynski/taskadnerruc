package com.test.adnerruc.domain.repository;

import com.test.adnerruc.domain.model.CaseEntity;
import com.test.adnerruc.domain.type.CaseState;
import com.test.adnerruc.domain.type.CaseType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CaseRepository extends JpaRepository<CaseEntity, Integer> {
    List<CaseEntity> findByDateOfEntryBetweenAndCaseType(LocalDate from, LocalDate to, CaseType caseType);
    List<CaseEntity> findByCaseState(CaseState caseState);
}
