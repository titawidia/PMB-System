package com.itc.pmbsystem.utils;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ErrorDTO {

    private LocalDateTime timestamp;

    private int status;

    private String message;

    private Object errors;
}
