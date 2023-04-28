package com.example.testapects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankClient {
    private int id;
    private String name;
    private int balance;
}
