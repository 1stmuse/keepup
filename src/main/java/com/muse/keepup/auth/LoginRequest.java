package com.muse.keepup.auth;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(
        @NotEmpty
        String email,
        @NotEmpty
        String password
) {
}
