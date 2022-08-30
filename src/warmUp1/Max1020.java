package warmUp1;
/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither
is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
public class Max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }

    public static int max1020(int a, int b) {
        int numA = a >= 10 && a <= 20 ? a : 0;
        int numB = b >= 10 && b <= 20 ? b : 0;

        if (numA == 0 && numB == 0) return 0;
        return Math.max(numA, numB);
    }
}
