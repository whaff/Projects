package src;

public class Doctor {
    public int id;
    public String name;
    public String department;
    public String schedule;

    public Doctor(int id, String name, String department, String schedule) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.schedule = schedule;
    }


    @Override
    public String toString() {
        return String.format("Doctor ID: %d, name: %s, Department: %s, Schedule: %s", id, name, department, schedule);
        
    }
}
