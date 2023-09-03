package com.test.adnerruc.controller;

import com.test.adnerruc.domain.type.CaseType;
import com.test.adnerruc.response.CaseFilterResponse;
import com.test.adnerruc.service.CaseService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CaseController {

    CaseService caseService;

    @Operation(summary = "Get filtered cases", description = "Task one. Get filtered cases.", tags = {"case"})
    @GetMapping("/search/case")
    public ResponseEntity<CaseFilterResponse> getFilteredCases(
            @RequestParam LocalDate from, @RequestParam LocalDate to, @RequestParam CaseType caseType) {
        return ResponseEntity.ok(caseService.getFilteredCases(from, to, caseType));
    }
}
