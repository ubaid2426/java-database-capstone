package com.smart_clinic_capstone.services;

import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    public String getDoctorById(Long id) {
        // Simulate fetching a doctor
        return "Doctor #" + id;
    }
}
