// Q4. Calculate the sum and average of all elements.
public class Arrays_Q04_Calculate_the_sum_and_average_of_all_elements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int x : arr) sum += x;
        double avg = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
