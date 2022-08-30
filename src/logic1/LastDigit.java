package logic1;
/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit.
The ints are non-negative.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */
public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13));
        System.out.println(lastDigit(23, 19, 12));
        System.out.println(lastDigit(23, 19, 3));
    }

    public static boolean lastDigit(int a, int b, int c) {
        int aRightMost = a % 10;
        int bRightMost = b % 10;
        int cRightMost = c % 10;

        return aRightMost == bRightMost || bRightMost == cRightMost || aRightMost == cRightMost;
    }
}
