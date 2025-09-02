package com.example.calendar.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequestDto(
        @NotBlank String username,
        @Email @NotBlank String email,
        @NotBlank @Size(min = 6, max = 24) String password
) {}
