package src;

public class Main {

    public static void main(String[] args) {

        // 1. Patient Records
        System.out.println("\nTesting Patient Records...");
        PatientRecords patientRecords = new PatientRecords();
        Patient p1 = new Patient(101, "Ahmed", 25, "055555555");
        Patient p2 = new Patient(102, "Saud", 22, "052222222");
        patientRecords.addPatient(p1);
        patientRecords.addPatient(p2);
        patientRecords.displayPatients();

        // 2. Emergency Queue
        System.out.println("\nTesting Emergency Queue...");
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        emergencyQueue.addPatient(p1, 3); // Less critical
        emergencyQueue.addPatient(p2, 1); // More critical
        System.out.println("Treating Patient: " + emergencyQueue.treatPatient().name);


        // 3. Treatment History
        System.out.println("\nTesting Treatment History...");
        TreatmentHistory history = new TreatmentHistory();
        history.addTreatment("Surgery on 2025-02-01");
        history.addTreatment("Prescibed Antibiotics");
        history.addTreatment("Annual Checkup");

        history.displayHistory();
        System.out.println("Last Treatment: " + history.getLastTreatment());


        // 4. Doctor Assignment
        System.out.println("\nTesting Doctor Assignments...");
        DoctorAssignments doctorAssignments = new DoctorAssignments();
        doctorAssignments.addDoctor(201, "Dr. khalid", "Cardiology", "9AM-5PM");
        doctorAssignments.addDoctor(202, "Dr. Sara", "Neurology", "10AM-6PM");
        doctorAssignments.displayDoctors();
    }
}
