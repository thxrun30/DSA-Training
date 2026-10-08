// Q3. Find the smallest element in an array.
public class Arrays_Q03_Find_the_smallest_element_in_an_array {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};
        int min = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
        }
        System.out.println("Smallest: " + min);
    }
}
