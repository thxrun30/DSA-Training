// Q2. Find the largest element in an array.
public class Arrays_Q02_Find_the_largest_element_in_an_array {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};
        int max = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
        }
        System.out.println("Largest: " + max);
    }
}
