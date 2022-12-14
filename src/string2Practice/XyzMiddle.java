package string2Practice;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to
the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */
public class XyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AAAxyzB"));
    }

    public static boolean xyzMiddle(String str) {
        if (str.length() < 3 || !str.contains("xyz")) return false;

        int mid = (str.length() / 2) - 1;
        if (str.substring(mid, mid + 3).equals("xyz") || (str.length() % 2 == 0 && str.substring(mid - 1, mid + 2).equals("xyz"))) {
            return true;
        }
        return false;
    }
}
