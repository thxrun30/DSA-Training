import java.util.*;

// Q10. Find the frequency of each element.
public class ArrayList_Q10_Find_the_frequency_of_each_element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4));
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : list) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        for (int key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }
}
