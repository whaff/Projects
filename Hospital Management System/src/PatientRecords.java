package src;

public class PatientRecords {

    private Patient head;

    public PatientRecords() {
        head = null;
    }

    public void addPatient(Patient patient) {
        if (head == null) {
            head = patient;
        } else {
            Patient curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = patient;
        }
    }

    public boolean updatePatient(int id, String newName, int newAge, String newContact) {
        Patient curr = head;
        while (curr != null) {
            if (curr.id == id) {
                curr.name = newName;
                curr.age = newAge;
                curr.contact = newContact;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public boolean removePatient(int id) {
        if (head == null) {
            return false;
        }
        if (head.id == id) {
            head = head.next;
            return true;
        }
        Patient prev = head;
        Patient curr = head.next;
        while (curr != null) {
            if (curr.id == id) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    public void displayPatients() {
        Patient current = head;
        while (current != null) {
            System.out.println("ID: " + current.id + ", Name: " + current.name + ", Age: " + current.age + ", Contact: " + current.contact);
            current.displayHistory();
            current = current.next;
        }
    }
    
    // Prints all patients in the list
    // public void displayAll() {
    //     if (head == null) {
    //         System.out.println("No patients in system");
    //     } else {
    //         Patient curr = head;
    //         while (curr != null) {
    //             System.out.println(curr);
    //             curr = curr.next;
    //         }
    //     }
    // }
}
