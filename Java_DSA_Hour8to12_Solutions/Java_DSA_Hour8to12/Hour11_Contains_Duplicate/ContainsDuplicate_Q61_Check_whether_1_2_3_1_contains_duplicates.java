// Q61. Check whether [1, 2, 3, 1] contains duplicates.
import java.util.HashSet;

public class ContainsDuplicate_Q61_Check_whether_1_2_3_1_contains_duplicates {
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int x : nums) {
            if (!seen.add(x)) return true; // add() returns false if already present
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println("Contains duplicate? " + containsDuplicate(nums));
    }
}
