package string3Practice;
/*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the
given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyy
 */
public class CountTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
        System.out.println(countTriple("222abyyycdXXX"));
    }

    public static int countTriple(String str) {
        int tripleCount = 0;
        if (str.length() < 3) return 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 3 || i == str.length() - 3) {
                if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2 )) {
                    tripleCount++;
                }
            }
        }
        return tripleCount;
    }
}
