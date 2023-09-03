package com.test.adnerruc.controller;

import com.test.adnerruc.response.CaseFilterResponse;
import com.test.adnerruc.service.CaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CaseController {

    CaseService caseService;

    @Operation(summary = "Get filtered cases", description = "Task one. Get filtered cases.", tags = {"case"})
    @GetMapping("/search/case")
    public ResponseEntity<CaseFilterResponse> getFilteredCases(
            @RequestParam(name = "Data od") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @Parameter(schema = @Schema(type = "string", description = "Date in ISO format (yyyy-MM-dd)")) String from,
            @RequestParam(name = "Data do") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @Parameter(schema = @Schema(type = "string", description = "Date in ISO format (yyyy-MM-dd)")) String to,
            @RequestParam(name = "Case type") String caseType) {
        return ResponseEntity.ok(caseService.getFilteredCases(from, to, caseType));
    }
}
