// Q10. Sort an array without using Arrays.sort().
public class Arrays_Q10_Sort_an_array_without_using_Arrays_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
