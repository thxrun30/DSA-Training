// Q51. Create a HashMap storing student names and marks, then print all entries.
import java.util.HashMap;

public class HashMap_Q51_Create_a_HashMap_storing_student_names_and_marks_then_print_all_entries {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 85);
        marks.put("Bob", 72);
        marks.put("Charlie", 90);
        marks.put("Diana", 68);
        for (String name : marks.keySet()) {
            System.out.println(name + " -> " + marks.get(name));
        }
    }
}
