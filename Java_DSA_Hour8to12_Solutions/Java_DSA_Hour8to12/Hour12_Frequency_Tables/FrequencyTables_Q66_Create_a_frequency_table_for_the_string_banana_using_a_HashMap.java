// Q66. Create a frequency table for the string "banana" using a HashMap.
import java.util.*;

public class FrequencyTables_Q66_Create_a_frequency_table_for_the_string_banana_using_a_HashMap {
    public static void main(String[] args) {
        String s = "banana";
        HashMap<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : freq.keySet()) {
            System.out.println(c + " -> " + freq.get(c));
        }
    }
}
