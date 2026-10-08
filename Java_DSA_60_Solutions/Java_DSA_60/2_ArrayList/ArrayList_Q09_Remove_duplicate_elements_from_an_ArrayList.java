import java.util.*;

// Q9. Remove duplicate elements from an ArrayList.
public class ArrayList_Q09_Remove_duplicate_elements_from_an_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        ArrayList<Integer> result = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(result);
    }
}
