package easy;

// 1342. Number of Steps to Reduce a Number to Zero
public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int numberOfSteps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                numberOfSteps++;
                num = num / 2;
            } else {
                numberOfSteps++;
                num--;
            }
        }
        return numberOfSteps;
    }
}
