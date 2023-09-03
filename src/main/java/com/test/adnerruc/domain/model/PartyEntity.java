package com.test.adnerruc.domain.model;

import com.test.adnerruc.domain.type.PartyType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_party")
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PartyEntity {

    @Id
    @Column(name = "id", nullable = false)
    int partyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "case_id")
    CaseEntity caseEntity;

    @Column(name = "party_type", nullable = false)
    @Enumerated(EnumType.STRING)
    PartyType partyType;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "active", nullable = false)
    boolean active;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "party_id")
    List<AddressEntity> addressEntities;

}
