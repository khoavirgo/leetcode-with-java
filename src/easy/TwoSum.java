package easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // nums[i] + nums[j] = target
                // nums[j] = target - num[i]
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (hm.containsKey(complement)) {
//                return new int[] { hm.get(complement), i };
//            } else
//                hm.put(nums[i], i);
//        }
//        return new int[] {};
//    }
}
