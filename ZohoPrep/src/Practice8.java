import java.util.Arrays;

public class Practice8 {

    public static void modifyAndRearrangeArray(int[] arr) {
        int n = arr.length;

        // Step 1: Modify the array
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }

        // Step 2: Rearrange the array to shift all zeros to the end
        int[] result = new int[n];
        int index = 0;
        
        // Add all non-zero elements to the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }
        
        // Copy the rearranged array back to the original array
        System.arraycopy(result, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {2, 2, 0, 4, 0, 8, 8, 0, 16};
        modifyAndRearrangeArray(arr);
        System.out.println(Arrays.toString(arr));  // Output: [4, 4, 16, 16, 0, 0, 0, 0, 0]
    }

}
