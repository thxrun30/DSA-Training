// Q9. Remove duplicate elements from an integer array.
public class Arrays_Q09_Remove_duplicate_elements_from_an_integer_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] result = new int[arr.length];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < n; j++) {
                if (result[j] == arr[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) result[n++] = arr[i];
        }
        for (int i = 0; i < n; i++) System.out.print(result[i] + " ");
        System.out.println();
    }
}
