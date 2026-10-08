import java.util.*;

// Q6. Check whether an element exists using contains().
public class ArrayList_Q06_Check_whether_an_element_exists_using_contains {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Contains 30? " + list.contains(30));
        System.out.println("Contains 99? " + list.contains(99));
    }
}
