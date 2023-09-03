package com.test.adnerruc.response;

import com.test.adnerruc.domain.dto.AddressDTO;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseStateResponse {
    List<AddressDTO> addresses;
}
