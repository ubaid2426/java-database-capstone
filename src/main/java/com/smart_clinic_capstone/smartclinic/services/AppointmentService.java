package com.smart_clinic_capstone.smartclinic.services;//package com.smartclinic.services;

//import com.smartclinic.models.Appointment;
import java.util.List;

public class AppointmentService {

    private List<Appointment> appointments;

    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAppointmentsByDoctorId(int doctorId) {
        return appointments.stream()
                .filter(app -> app.getDoctorId() == doctorId)
                .toList();
    }
}
