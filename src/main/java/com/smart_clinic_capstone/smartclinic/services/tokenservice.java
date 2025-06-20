package com.smart_clinic_capstone.services;

import org.springframework.stereotype.Service;

@Service
public class TokenService {
    public String generateToken(String userId) {
        // Simulate token generation
        return "token_for_" + userId;
    }
}
