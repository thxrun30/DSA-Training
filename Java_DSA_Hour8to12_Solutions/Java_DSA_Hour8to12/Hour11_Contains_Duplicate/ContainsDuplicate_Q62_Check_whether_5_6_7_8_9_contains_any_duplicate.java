// Q62. Check whether [5, 6, 7, 8, 9] contains any duplicate.
import java.util.HashSet;

public class ContainsDuplicate_Q62_Check_whether_5_6_7_8_9_contains_any_duplicate {
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int x : nums) {
            if (!seen.add(x)) return true; // add() returns false if already present
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 9};
        System.out.println("Contains duplicate? " + containsDuplicate(nums));
    }
}
