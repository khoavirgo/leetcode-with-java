//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] arr = {1, 2, 3, -2, 5};
    int k = 5;

    List<int[]> result = subArrayFromArray(arr, k);
    for (int[] sub : result) {
        System.out.println(Arrays.toString(sub));
    }

}
