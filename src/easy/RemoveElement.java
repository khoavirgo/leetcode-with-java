package easy;

// 27. Remove Element
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        // Two pointers, the left pointer iterates from the beginning of the array and the right from the end
        while (left <= right) {
            if (nums[left] == val) {
                // Override value at left with value at right
                nums[left] = nums[right];
                // Move the right pointer to the left
                right--;
            } else
                // Move the left pointer to the right
                left++;
        }
        return left;
    }
}
