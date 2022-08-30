package logic1;
/*
Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true,
but 40 returns false

less20(18) → true
less20(19) → true
less20(20) → false
 */
public class Less20 {
    public static void main(String[] args) {
        System.out.println(less20(18));
        System.out.println(less20(19));
        System.out.println(less20(20));
    }

    public static boolean less20(int n) {
        return Math.abs((n % 20) - 20) == 1 || Math.abs((n % 20) - 20) == 2;
    }
}
