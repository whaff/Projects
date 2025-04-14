package src;

public class Patient {

    public int id;
    public String name;
    public int age;
    public String contact;
    public MedicalHistoryEntry historyHead;
    public Patient next;
    public int priority;

    // constructor for patient to set his name, age, etc.. 
    public Patient(int id, String name, int age, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.next = null;
        this.historyHead = null;
    }

    // @Override
    // public String toString() {
    //     return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Contact: " + contact;
    // }

    public void addHistory(String detail) {
        MedicalHistoryEntry newEntry = new MedicalHistoryEntry(detail);
        if (historyHead == null) {
            historyHead = newEntry;
        } else {
            MedicalHistoryEntry current = historyHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEntry;
        }
    }
    

    public void displayHistory() {
        System.out.print("Medical History: [");
        MedicalHistoryEntry current = historyHead;
        while (current != null) {
            System.out.print(current.detail);
            if (current.next != null) System.out.print(", ");
            current = current.next;
        }
        System.out.println("]");
    }
    
    

}
