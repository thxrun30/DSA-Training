// Q57. Find the common elements between [1, 2, 3, 4, 5] and [3, 4, 5, 6, 7] using HashSet.
import java.util.HashSet;

public class HashSet_Q57_Find_the_common_elements_between_1_2_3_4_5_and_3_4_5_6_7_using_HashSet {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};
        HashSet<Integer> set = new HashSet<>();
        for (int x : a) set.add(x);
        HashSet<Integer> common = new HashSet<>();
        for (int x : b) {
            if (set.contains(x)) common.add(x);
        }
        System.out.println("Common elements: " + common);
    }
}
