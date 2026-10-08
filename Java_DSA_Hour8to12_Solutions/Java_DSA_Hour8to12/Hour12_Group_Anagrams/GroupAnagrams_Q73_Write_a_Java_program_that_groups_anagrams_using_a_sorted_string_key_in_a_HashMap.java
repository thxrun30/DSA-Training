// Q73. Write a Java program that groups anagrams using a sorted-string key in a HashMap.
import java.util.*;

public class GroupAnagrams_Q73_Write_a_Java_program_that_groups_anagrams_using_a_sorted_string_key_in_a_HashMap {
    public static void main(String[] args) {
        String[] words = {"bat", "tab", "cat", "act", "tac", "dog"};
        HashMap<String, List<String>> map = new LinkedHashMap<>();
        for (String w : words) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
