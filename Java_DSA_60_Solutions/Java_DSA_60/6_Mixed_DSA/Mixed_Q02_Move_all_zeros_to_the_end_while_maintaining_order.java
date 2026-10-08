import java.util.Arrays;

// Q2. Move all zeros to the end while maintaining order.
public class Mixed_Q02_Move_all_zeros_to_the_end_while_maintaining_order {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        int idx = 0;
        for (int x : arr) {
            if (x != 0) arr[idx++] = x;
        }
        while (idx < arr.length) arr[idx++] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
