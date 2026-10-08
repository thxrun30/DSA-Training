// Q56. Create a HashSet and remove duplicate values from [10, 20, 10, 30, 20, 40].
import java.util.HashSet;

public class HashSet_Q56_Create_a_HashSet_and_remove_duplicate_values_from_10_20_10_30_20_40 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x); // duplicates are ignored
        System.out.println("Without duplicates: " + set);
    }
}
