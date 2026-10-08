import java.util.*;

// Q5. Remove an element using remove(index) and remove(Object).
public class ArrayList_Q05_Remove_an_element_using_remove_index_and_remove_Object {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        list.remove(1);                    // remove by index
        list.remove(Integer.valueOf(40));  // remove by object (value)
        System.out.println(list);
    }
}
