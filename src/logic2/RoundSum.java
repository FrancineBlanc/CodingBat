package logic2;

public class RoundSum {
    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18));
        System.out.println(roundSum(12, 13, 14));
        System.out.println(roundSum(6, 4, 4));
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        int right = num % 10;
        int rounded = 0;
        if (right >= 5) {
            int remainder = 10 - right;
            rounded = remainder + num;
        } else {
            rounded = num - right;
        }
        return rounded;
    }
}
