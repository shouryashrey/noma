package com.shouryashrey.noma.model.standardResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StatusResponse {
    private String message;
    private Integer statusCode;
    private Long timestamp;
}
