import java.util.*;

// Q3. Find duplicate elements in an ArrayList.
public class Mixed_Q03_Find_duplicate_elements_in_an_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5, 2));
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int x : list) {
            if (!seen.add(x)) duplicates.add(x);
        }
        System.out.println("Duplicates: " + duplicates);
    }
}
