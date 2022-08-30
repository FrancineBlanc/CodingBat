package logic1;

public class TwoAsOne {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        System.out.println(twoAsOne(3, 2, 2));
    }

    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b != c) {
            if (b + c == a) {
                return true;
            } else {
                return a + c == b;
            }
        } else {
            return true;
        }
    }
}
