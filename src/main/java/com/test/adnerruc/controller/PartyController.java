package com.test.adnerruc.controller;

import com.test.adnerruc.response.CaseStateResponse;
import com.test.adnerruc.service.PartyService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class PartyController {

    PartyService partyService;

    @Operation(summary = "Get filtered addresses", description = "Task two. Get filtered addresses.", tags = {"addresses"})
    @GetMapping("/addresses")
    public ResponseEntity<CaseStateResponse> getCaseState(
            @RequestParam String caseState) {
        return ResponseEntity.ok(partyService.getActivePartyAddressByCaseState(caseState));
    }
}
