package com.test.adnerruc.response;

import com.test.adnerruc.domain.type.CaseState;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseFilterResponse {
    Map<CaseState, Long> caseTypeCount;
}
