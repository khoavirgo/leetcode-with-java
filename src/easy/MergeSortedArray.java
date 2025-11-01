package easy;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Index of the last valid element in nums1
        int i = m - 1;
        // Index of the last element in nums2
        int j = n - 1;
        // Index of the last position in nums1 after merging
        int k = m + n - 1;

        // Iterate from the end of nums1 backwards (in-place merge)
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        // Insert n elements from nums2 to nums1 after m elements
//        for (int i = 0; i < n; i++) {
//            nums1[i + m] = nums2[i];
//        }
//        // Sort result after merged
//        Arrays.sort(nums1);
//    }
}
