import java.util.*;

// Q8. Sort an ArrayList ascending and descending.
public class ArrayList_Q08_Sort_an_ArrayList_ascending_and_descending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));
        Collections.sort(list);
        System.out.println("Ascending: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);
    }
}
