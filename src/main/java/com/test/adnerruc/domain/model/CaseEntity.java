package com.test.adnerruc.domain.model;

import com.test.adnerruc.domain.type.CaseState;
import com.test.adnerruc.domain.type.CaseType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_case")
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseEntity {

    @Id
    @Column(name = "id", nullable = false)
    int caseId;

    @Column(name = "case_number", nullable = false)
    String caseNumber;

    @Column(name = "case_type", nullable = false)
    @Enumerated(EnumType.STRING)
    CaseType caseType;

    @Column(name = "case_state", nullable = false)
    @Enumerated(EnumType.STRING)
    CaseState caseState;

    @Column(name = "data_of_entry", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateOfEntry;

    @OneToMany(mappedBy = "caseEntity")
    List<PartyEntity> parties;
}
