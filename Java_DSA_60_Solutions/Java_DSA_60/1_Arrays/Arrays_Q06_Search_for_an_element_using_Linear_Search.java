// Q6. Search for an element using Linear Search.
public class Arrays_Q06_Search_for_an_element_using_Linear_Search {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1) System.out.println(key + " found at index " + index);
        else System.out.println(key + " not found");
    }
}
