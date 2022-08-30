package logic1;
/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
 */
public class NearTen {
    public static void main(String[] args) {
        System.out.println(nearTen(12));
        System.out.println(nearTen(17));
        System.out.println(nearTen(19));
    }

    public static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }
}
