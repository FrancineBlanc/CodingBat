package string2Practice;
/*
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear
somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */
public class PrefixAgain {
    public static void main(String[] args) {
        String input = "abXYabc";
        System.out.println(prefixAgain(input, 1));
        System.out.println(prefixAgain(input, 2));
        System.out.println(prefixAgain(input, 3));
    }

    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        if (str.length() <= 1) return false;
        if (n == 1 && str.charAt(0) == str.charAt(1)) {
            return true;
        }
        for (int i = n; i < str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) return true;
        }
        return false;
    }
}
