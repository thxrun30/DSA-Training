// Q67. Find the frequency of every number in [1, 3, 2, 3, 4, 3, 2, 3].
import java.util.*;

public class FrequencyTables_Q67_Find_the_frequency_of_every_number_in_1_3_2_3_4_3_2_3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2, 3};
        HashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        for (int key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }
}
