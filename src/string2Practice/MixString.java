package string2Practice;
/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */
public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int aLength = a.length();
        int bLength = b.length();
        int i = 0;

        if (aLength <= bLength) {
            while (i < aLength) {
                stringBuilder.append(a.charAt(i));
                stringBuilder.append(b.charAt(i));
                i++;
            }
            while (i < bLength) {
                stringBuilder.append(b.charAt(i));
                i++;
            }
        } else {
            while (i < bLength) {
                stringBuilder.append(a.charAt(i));
                stringBuilder.append(b.charAt(i));
                i++;
            }
            while (i < aLength) {
                stringBuilder.append(a.charAt(i));
                i++;
            }
        }
        return stringBuilder.toString();
    }
}
