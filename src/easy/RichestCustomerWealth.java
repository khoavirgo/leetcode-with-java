package easy;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int biggestWealth = 0;
        for (int[] account : accounts) {
            int sumCustomerWealth = 0;
            for (int i : account) {
                sumCustomerWealth += i;
                if (sumCustomerWealth > biggestWealth)
                    biggestWealth = sumCustomerWealth;
            }
        }
        return biggestWealth;
    }
}
