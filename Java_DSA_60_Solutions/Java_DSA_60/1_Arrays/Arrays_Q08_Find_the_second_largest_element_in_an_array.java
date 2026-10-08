// Q8. Find the second largest element in an array.
public class Arrays_Q08_Find_the_second_largest_element_in_an_array {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }
        System.out.println("Second largest: " + second);
    }
}
