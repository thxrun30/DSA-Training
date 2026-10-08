import java.util.*;

// Q4. Replace an element using set().
public class ArrayList_Q04_Replace_an_element_using_set {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        list.set(1, 99); // replace element at index 1
        System.out.println(list);
    }
}
