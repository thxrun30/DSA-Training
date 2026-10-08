// Q7. A call-center system stores the last four operations in LIFO order. Simulate adding A, B, C, D and removing two operations.
import java.util.Stack;

public class LIFO_Q07_A_call_center_system_stores_the_last_four_operations_in_LIFO_order_Simulate_adding_A_B_C_D_and_removing_two_operations {
    public static void main(String[] args) {
        Stack<String> operations = new Stack<>();
        operations.push("A");
        operations.push("B");
        operations.push("C");
        operations.push("D");
        System.out.println("Removed: " + operations.pop());
        System.out.println("Removed: " + operations.pop());
        System.out.println("Remaining operations: " + operations);
    }
}
