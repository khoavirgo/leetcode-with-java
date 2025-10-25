package easy;

public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int k = n / 7;
        int u1 = 28;
        // arithmetic progression with u1 = 28 and common difference d = 7
        int un = u1 + (k - 1) * 7;
        // Sn
        int arithmeticSum = k * (u1 + un) / 2;
        int monday = 1 + k;
        int finalWeek = 0;
        for (int day = 0; day < n % 7; day++) {
            finalWeek += monday + day;
        }
        return arithmeticSum + finalWeek;
    }

//    public int totalMoney(int n) {
//        int ans = 0, monday = 1;
//        while (n > 0) {
//            for (int day = 0; day < Math.min(n, 7); day++) {
//                ans += monday + day;
//            }
//            // begin a new week and increase money deposit on Monday by 1
//            n -= 7;
//            monday++;
//        }
//        return ans;
//    }
}
