// Q22. A bank has customers A, B, C, D. Serve them in FIFO order and display the queue after serving B.
import java.util.*;

public class Queue_Q22_A_bank_has_customers_A_B_C_D_Serve_them_in_FIFO_order_and_display_the_queue_after_serving_B {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        System.out.println("Served: " + queue.poll());
        System.out.println("Served: " + queue.poll());
        System.out.println("Queue after serving B: " + queue);
    }
}
