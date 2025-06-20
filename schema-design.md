# Smart Clinic MySQL Database Schema

## Tables

### 1. Admin
- id (INT, PK)
- username (VARCHAR)
- password (VARCHAR)

### 2. Doctor
- id (INT, PK)
- name (VARCHAR)
- specialization (VARCHAR)
- phone (VARCHAR)
- email (VARCHAR)

### 3. Patient
- id (INT, PK)
- name (VARCHAR)
- age (INT)
- phone (VARCHAR)
- email (VARCHAR)

### 4. Appointment
- id (INT, PK)
- doctor_id (INT, FK ? Doctor)
- patient_id (INT, FK ? Patient)
- date (DATE)
- time (TIME)
- status (ENUM: pending, confirmed, completed)

### Relationships
- One Doctor ? Many Appointments
- One Patient ? Many Appointments
