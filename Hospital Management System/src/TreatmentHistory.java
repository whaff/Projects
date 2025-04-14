package src;
import java.util.Stack;

public class TreatmentHistory {
    private final Stack<String> treatments;

    public TreatmentHistory() {
        treatments = new Stack<>();
    }

    // Add a new treatment (pushes to stack)
    public void addTreatment(String treatment) {
        treatments.push(treatment);
    }

    // View last treatment (peek at stack)
    public String getLastTreatment() {
        if (treatments.empty()) {
            return "No treatments recorded";
        }
        return treatments.peek();
    }

    // Display full history (matches screenshot format)
    public void displayHistory() {
        System.out.print("Treatment History: [");
        if (!treatments.empty()) {
            // Stack prints in reverse order, so we need to handle it
            for (int i = 0; i < treatments.size(); i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(treatments.get(i));
            }
        }
        System.out.println("]");
    }
}