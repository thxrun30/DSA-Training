// Q48. Find the 3 largest elements in [10, 4, 7, 20, 15, 3, 25] using a PriorityQueue.
import java.util.PriorityQueue;

public class PriorityQueue_Q48_Find_the_3_largest_elements_in_10_4_7_20_15_3_25_using_a_PriorityQueue {
    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 20, 15, 3, 25};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap holding the k largest
        for (int x : arr) {
            pq.add(x);
            if (pq.size() > k) pq.poll(); // remove the smallest
        }
        int[] top = new int[k];
        for (int i = k - 1; i >= 0; i--) top[i] = pq.poll();
        System.out.print("3 largest elements: ");
        for (int x : top) System.out.print(x + " ");
        System.out.println();
    }
}
