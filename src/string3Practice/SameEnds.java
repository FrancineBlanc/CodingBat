package string3Practice;
/*
Given a string, return the longest substring that appears at both the beginning and end of the string without
overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */

public class SameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
        System.out.println(sameEnds("abXYab"));
    }

    public static String sameEnds(String string) {
        int i = 0;
        int mid = string.length() % 2 == 0 ? string.length() / 2 : string.length() / 2 + 1;

        for (int j = mid; j < string.length(); j++) {
            if (string.charAt(i) == string.charAt(j)) {
                i++;
            } else {
                i = 0;
            }
        }
        return string.substring(0, i);
    }
}
