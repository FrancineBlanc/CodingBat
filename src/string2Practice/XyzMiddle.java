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
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        if (str.length() <= 2) return false;
        int indexXyz = str.lastIndexOf("xyz");
        String precedingSubstring = str.substring(0, indexXyz);
        String followingSubstring = str.substring(indexXyz + 3);

        if (precedingSubstring.length() >= followingSubstring.length()) {
            return precedingSubstring.length() - followingSubstring.length() <= 1;
        }

        if (followingSubstring.length() >= precedingSubstring.length()) {
            return followingSubstring.length() - precedingSubstring.length() <= 1;
        }
        return false;
    }
}
