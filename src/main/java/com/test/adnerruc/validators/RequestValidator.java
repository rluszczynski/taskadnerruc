package com.test.adnerruc.validators;

import com.test.adnerruc.domain.type.CaseType;
import com.test.adnerruc.exceptions.ApiRequestException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class RequestValidator {


    public void requestCaseFilterValidator(String from, String to, String caseType) {
        if (!isValidDate(from) || !isValidDate(to) || !isEnum(caseType, CaseType.class)) {
            throw new ApiRequestException("Niepoprawnie wprowadzone dane");
        }
    }


    public static boolean isValidDate(String dateStr) {
        SimpleDateFormat formatDaty = new SimpleDateFormat("yyyy-MM-dd");
        formatDaty.setLenient(false);
        try {
            formatDaty.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static <E extends Enum<E>> void requestEnumValidator(String name, Class<E> enumName) {
        if (!isEnum(name, enumName)) {
            throw new ApiRequestException("Niepoprawnie wprowadzone dane typu enum");
        }
    }

    public static <E extends Enum<E>> boolean isEnum(String name, Class<E> enumName) {
        if (name == null) {
            return false;
        }
        try {
            Enum.valueOf(enumName, name);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
