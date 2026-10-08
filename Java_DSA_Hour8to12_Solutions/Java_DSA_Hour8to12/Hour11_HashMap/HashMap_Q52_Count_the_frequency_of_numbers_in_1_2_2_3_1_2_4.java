// Q52. Count the frequency of numbers in [1, 2, 2, 3, 1, 2, 4].
import java.util.HashMap;

public class HashMap_Q52_Count_the_frequency_of_numbers_in_1_2_2_3_1_2_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 4};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        for (int key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }
}
