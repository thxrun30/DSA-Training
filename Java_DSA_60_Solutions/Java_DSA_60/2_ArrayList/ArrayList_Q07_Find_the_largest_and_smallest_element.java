import java.util.*;

// Q7. Find the largest and smallest element.
public class ArrayList_Q07_Find_the_largest_and_smallest_element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 45, 7, 89, 23));
        System.out.println("Largest: " + Collections.max(list));
        System.out.println("Smallest: " + Collections.min(list));
    }
}
