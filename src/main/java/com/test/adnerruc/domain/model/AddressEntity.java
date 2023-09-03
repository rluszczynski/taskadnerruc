package com.test.adnerruc.domain.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_address")
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressEntity {

    @Id
    @Column(name = "id", nullable = false)
    int id;

    @Column(name = "city")
    String city;

    @Column(name = "postal_code")
    String postalCode;

    @Column(name = "street")
    String street;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "party_id")
    PartyEntity party;
}
