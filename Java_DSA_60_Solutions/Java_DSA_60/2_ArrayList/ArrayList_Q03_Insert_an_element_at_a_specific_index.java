import java.util.*;

// Q3. Insert an element at a specific index.
public class ArrayList_Q03_Insert_an_element_at_a_specific_index {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        list.add(2, 99); // insert 99 at index 2
        System.out.println(list);
    }
}
