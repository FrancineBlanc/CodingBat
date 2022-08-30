package string2Practice;
/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star,
they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 */

public class SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
        System.out.println(sameStarChar("**"));
    }

    public static boolean sameStarChar(String str) {
        if (str.isEmpty() || (str.length() == 1 && str.charAt(0) == '*')) {
            return true;
        }

        int counter = 0;
        int numStars = 0;

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                numStars++;
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    counter++;
                }
            }
        }
        return numStars - counter == 0;
    }
}
