package com.smart_clinic_capstone.smartclinic.controllers;//package com.smartclinic.controllers;
//
//import com.smartclinic.models.Doctor;
import java.util.List;

import com.smart_clinic_capstone.smartclinic.Doctor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    // Simulated list for demonstration
    private List<Doctor> doctors;

    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor) {
        doctors.add(doctor);
        return "Doctor added successfully.";
    }

    @GetMapping("/all")
    public List<Doctor> getAllDoctors() {
        return doctors;
    }
}
