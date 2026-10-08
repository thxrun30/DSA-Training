// Q46. Create a Java PriorityQueue and insert 30, 10, 50, 20, 40. Print elements in priority order.
import java.util.PriorityQueue;

public class PriorityQueue_Q46_Create_a_Java_PriorityQueue_and_insert_30_10_50_20_40_Print_elements_in_priority_order {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);
        System.out.print("Priority order (smallest first): ");
        while (!pq.isEmpty()) System.out.print(pq.poll() + " ");
        System.out.println();
    }
}
