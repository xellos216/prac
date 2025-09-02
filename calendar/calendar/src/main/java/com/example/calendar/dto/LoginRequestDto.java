package com.example.calendar.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginRequestDto(
        @Email @NotBlank String email,
        @NotBlank String password
) {}
