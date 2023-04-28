package com.example.testapects.error;

import lombok.AllArgsConstructor;


public class ServerException extends CustomException {

    public ServerException(String title, String message, int code) {
        super(title, message, code);
    }
}
