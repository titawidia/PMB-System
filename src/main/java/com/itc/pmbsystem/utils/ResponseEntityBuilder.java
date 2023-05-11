package com.itc.pmbsystem.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityBuilder {

    public static ResponseEntity<Object> build(Object data, HttpStatus status) {
        return new ResponseEntity<>(data, status);
    }

}
