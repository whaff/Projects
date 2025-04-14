package src;

import java.util.HashMap;

public class DoctorAssignments {

    private HashMap<Integer, Doctor> doctors = new HashMap<>();

    public DoctorAssignments() {
        doctors = new HashMap<>();
    }


    public void addDoctor(int id, String name, String department, String schedule) {
        doctors.put(id, new Doctor(id, name, department, schedule));
    }

    public Doctor geDoctor(int id) {
        return doctors.get(id);
    }

    public void displayDoctors() {
        for (Doctor doctor : doctors.values()) {
            System.out.println(doctor);
        }
    }
}
