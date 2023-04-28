package com.example.testapects.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends Exception {
    private String title;
    private String message;
    private int code;
}
