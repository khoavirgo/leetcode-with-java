package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubArrayFromArrayWithK {
    public static List<int[]> getSubArrays(int[] nums, int k) {
        List<int[]> subArrays = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int prefixSum = 0;
            for (int j = i; j < nums.length; j++) {
                prefixSum += nums[j];
                if (prefixSum == k) {
                    int[] subArray = Arrays.copyOfRange(nums, i, j + 1);
                    subArrays.add(subArray);
                }
            }
        }
        return subArrays;
    }
}

//List<int[]> subArrayFromArray(int[] arr, int k) {
//    List<int[]> subArrays = new ArrayList<>();
//    int[] subArray = new int[arr.length];
//    int sum = 0;
//
//    for (int i = 0; i < arr.length; i++) {
//        if (sum == k) {
//            sum = 0;
//            subArrays.add(subArray);
//            subArray = new int[arr.length];
//            break;
//        }
//        sum += arr[i];
//        subArray[i] = arr[i];
//    }
//
//    return subArrays;
//}