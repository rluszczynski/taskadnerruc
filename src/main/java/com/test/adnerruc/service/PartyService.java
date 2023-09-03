package com.test.adnerruc.service;

import com.test.adnerruc.domain.dto.AddressDTO;
import com.test.adnerruc.domain.model.CaseEntity;
import com.test.adnerruc.domain.model.PartyEntity;
import com.test.adnerruc.domain.repository.CaseRepository;
import com.test.adnerruc.domain.type.CaseState;
import com.test.adnerruc.response.CaseStateResponse;
import com.test.adnerruc.validators.RequestValidator;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class PartyService {

    CaseRepository caseRepository;

    public CaseStateResponse getActivePartyAddressByCaseState(String caseState) {
        RequestValidator.requestEnumValidator(caseState, CaseState.class);
        List<CaseEntity> casesWithState = caseRepository.findByCaseState(CaseState.valueOf(caseState));
        List<AddressDTO> collect = casesWithState.stream()
                .map(CaseEntity::getParties)
                .flatMap(List::stream)
                .filter(PartyEntity::isActive)
                .flatMap(party -> party.getAddressEntities().stream())
                .map(addressEntity -> AddressDTO.builder()
                        .postalCode(addressEntity.getPostalCode())
                        .city(addressEntity.getCity())
                        .street(addressEntity.getStreet())
                        .build())
                .collect(Collectors.toList());
        return CaseStateResponse.builder()
                .addresses(collect)
                .build();
    }
}
