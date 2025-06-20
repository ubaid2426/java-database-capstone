package com.smart_clinic_capstone.repositories;

import com.smart_clinic_capstone.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Appointment, Long> {
    // Define patient-related queries if needed
}
