// Q63. Given employee IDs [101, 102, 103, 101, 105], find the duplicated IDs.
import java.util.HashSet;

public class ContainsDuplicate_Q63_Given_employee_IDs_101_102_103_101_105_find_the_duplicated_IDs {
    public static void main(String[] args) {
        int[] ids = {101, 102, 103, 101, 105};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int id : ids) {
            if (!seen.add(id)) duplicates.add(id);
        }
        System.out.println("Duplicated IDs: " + duplicates);
    }
}
