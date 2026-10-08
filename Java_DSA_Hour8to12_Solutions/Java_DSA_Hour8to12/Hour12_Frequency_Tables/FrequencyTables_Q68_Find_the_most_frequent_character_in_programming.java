// Q68. Find the most frequent character in "programming".
import java.util.*;

public class FrequencyTables_Q68_Find_the_most_frequent_character_in_programming {
    public static void main(String[] args) {
        String s = "programming";
        HashMap<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        for (int count : freq.values()) {
            if (count > max) max = count;
        }
        System.out.println("Highest frequency: " + max);
        System.out.print("Most frequent character(s): ");
        for (char c : freq.keySet()) {
            if (freq.get(c) == max) System.out.print(c + " ");
        }
        System.out.println();
    }
}
