// Q7. Reverse an array without using another array.
public class Arrays_Q07_Reverse_an_array_without_using_another_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
