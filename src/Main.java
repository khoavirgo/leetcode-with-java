import static others.FindSubArrayFromArrayWithK.getSubArrays;

void main() {
    int[] arr = {1, 2, 3, -2, 5};
    int k = 5;

    List<int[]> result = getSubArrays(arr, k);
    for (int[] sub : result) {
        System.out.println(Arrays.toString(sub));
    }
}
