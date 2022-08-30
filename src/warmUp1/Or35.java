package warmUp1;
/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.

or35(3) → true
or35(10) → true
or35(8) → false
 */
public class Or35 {
    public static void main(String[] args) {
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
    }

    public static boolean or35(int n) {
        return Math.abs(n) % 3 == 0 || Math.abs(n) % 5 == 0;
    }
}
