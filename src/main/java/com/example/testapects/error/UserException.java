package com.example.testapects.error;

public class UserException extends CustomException{

    public UserException(String title, String message, int code) {
        super(title, message, code);
    }
}
