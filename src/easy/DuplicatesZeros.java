package easy;

public class DuplicatesZeros {
    // Brute force
    // Time complexity: O(n)
    // Space complexity: O(1)
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                // Shift each element one position to the right
                for (int j = arr.length - 2; j > i; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[i + 1] = 0;
                // Skip the zero just added
                i++;
            }
        }
    }
}
