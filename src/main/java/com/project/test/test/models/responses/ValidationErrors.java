package com.project.test.test.models.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
public class ValidationErrors {
    private Map<String, String> errors;
    private Date timestamp;
}
