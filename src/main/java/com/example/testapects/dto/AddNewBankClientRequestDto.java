package com.example.testapects.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddNewBankClientRequestDto {
    @NotBlank
    @Pattern(regexp = "^(.+)@(yandex.ru|google.com)$")
    private String name;

    @Min(0)
    @Max(999)
    private int balance;
}
