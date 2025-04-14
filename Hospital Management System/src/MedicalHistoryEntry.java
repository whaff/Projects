package src;

public class MedicalHistoryEntry {
    public String detail;
    public MedicalHistoryEntry next;

    public MedicalHistoryEntry(String detail) {
        this.detail = detail;
        this.next = null;
    }

    @Override
    public String toString() {
        return detail;
    }
}
