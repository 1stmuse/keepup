package com.muse.keepup.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record RegisterUserRequest(
        @NotEmpty()
        String firstname,
        @NotEmpty
        String lastname,
        @NotEmpty(message = "Password cannot be empty")
        String password,
        String username,

        @Email(message = "email must be valid")
                @NotEmpty(message = "email cannot be empty")
        String email
) {
}
