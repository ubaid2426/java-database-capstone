package com.smart_clinic_capstone.smartclinic.models;//package com.smartclinic.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private int id;
    private int doctorId;
    private int patientId;
    private LocalDate date;
    private LocalTime time;
    private String status; // e.g., "pending", "confirmed", "completed"

    // Constructor
    public Appointment(int id, int doctorId, int patientId, LocalDate date, LocalTime time, String status) {
        this.id = id;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    // Getters and Setters ...
}
