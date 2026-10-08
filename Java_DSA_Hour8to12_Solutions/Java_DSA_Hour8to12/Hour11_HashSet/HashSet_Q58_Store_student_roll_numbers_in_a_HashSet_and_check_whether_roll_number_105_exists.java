// Q58. Store student roll numbers in a HashSet and check whether roll number 105 exists.
import java.util.HashSet;

public class HashSet_Q58_Store_student_roll_numbers_in_a_HashSet_and_check_whether_roll_number_105_exists {
    public static void main(String[] args) {
        HashSet<Integer> rolls = new HashSet<>();
        rolls.add(101);
        rolls.add(102);
        rolls.add(103);
        rolls.add(104);
        rolls.add(105);
        rolls.add(106);
        int key = 105;
        if (rolls.contains(key)) System.out.println("Roll number " + key + " exists");
        else System.out.println("Roll number " + key + " does not exist");
    }
}
