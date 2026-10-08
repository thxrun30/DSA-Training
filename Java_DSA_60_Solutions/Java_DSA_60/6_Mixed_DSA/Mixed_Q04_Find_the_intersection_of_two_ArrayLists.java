import java.util.*;

// Q4. Find the intersection of two ArrayLists.
public class Mixed_Q04_Find_the_intersection_of_two_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 2));
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : a) {
            if (b.contains(x) && !result.contains(x)) result.add(x);
        }
        System.out.println("Intersection: " + result);
    }
}
