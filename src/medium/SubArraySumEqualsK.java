package medium;


// 560. Subarray Sum Equals K
public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

//    public int subarraySum(int[] nums, int k) {
//        int prefixSum = 0, count = 0;
//        // {prefixSum: appearance(s)}
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(0, 1);
//
//        for (int i = 0; i < nums.length; i++) {
//            prefixSum += nums[i];
//            if (map.containsKey(prefixSum - k))
//                count += map.get(prefixSum - k);
//            // if prefixSum already exists in map, increase appearance by 1
//            // otherwise, generate map {prefixSum: 1}
//            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
//        }
//        return count;
//    }
}


