// Q47. A hospital assigns higher priority to larger priority numbers. Process patients A(3), B(5), C(1), D(4).
import java.util.PriorityQueue;

public class PriorityQueue_Q47_A_hospital_assigns_higher_priority_to_larger_priority_numbers_Process_patients_A_3_B_5_C_1_D_4 {
    static class Patient {
        String name;
        int priority;

        Patient(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> p2.priority - p1.priority);
        pq.add(new Patient("A", 3));
        pq.add(new Patient("B", 5));
        pq.add(new Patient("C", 1));
        pq.add(new Patient("D", 4));
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println("Treating patient " + p.name + " (priority " + p.priority + ")");
        }
    }
}
