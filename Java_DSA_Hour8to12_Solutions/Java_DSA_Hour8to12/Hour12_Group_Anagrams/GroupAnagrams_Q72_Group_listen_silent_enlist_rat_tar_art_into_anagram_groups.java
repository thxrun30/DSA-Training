// Q72. Group ["listen", "silent", "enlist", "rat", "tar", "art"] into anagram groups.
import java.util.*;

public class GroupAnagrams_Q72_Group_listen_silent_enlist_rat_tar_art_into_anagram_groups {
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
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art"};
        System.out.println(groupAnagrams(words));
    }
}
