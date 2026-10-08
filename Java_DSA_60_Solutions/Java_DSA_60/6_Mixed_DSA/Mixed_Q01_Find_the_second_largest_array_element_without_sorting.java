// Q1. Find the second largest array element without sorting.
public class Mixed_Q01_Find_the_second_largest_array_element_without_sorting {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
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
