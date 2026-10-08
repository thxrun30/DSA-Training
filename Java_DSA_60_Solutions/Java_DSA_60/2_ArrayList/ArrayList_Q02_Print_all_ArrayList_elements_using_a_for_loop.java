import java.util.*;

// Q2. Print all ArrayList elements using a for loop.
public class ArrayList_Q02_Print_all_ArrayList_elements_using_a_for_loop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
