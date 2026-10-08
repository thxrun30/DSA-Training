// Q71. Group the anagrams in ["eat", "tea", "tan", "ate", "nat", "bat"].
import java.util.*;

public class GroupAnagrams_Q71_Group_the_anagrams_in_eat_tea_tan_ate_nat_bat {
    static List<List<String>> groupAnagrams(String[] words) {
        HashMap<String, List<String>> map = new LinkedHashMap<>();
        for (String w : words) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // sorted letters = anagram key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
    }
}
