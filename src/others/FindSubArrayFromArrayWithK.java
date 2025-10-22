package others;

public class FindSubArrayFromArrayWithK {

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