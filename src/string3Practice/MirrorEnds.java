package string3Practice;
/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very beginning of the given string, and at the very end of the string in
reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */
public class MirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }

    public static String mirrorEnds(String string) {
        if (string.equals(new StringBuilder(string).reverse().toString())) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int j = string.length() - 1;

        while (i <= j && string.charAt(i) == string.charAt(j)) {
            stringBuilder.append(string.charAt(i));
            i++;
            j--;
        }
        return stringBuilder.toString();
    }
}
