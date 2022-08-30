package string2Practice;
/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than
3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */
public class OneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
        System.out.println(oneTwo("tcagdoe"));
    }

    public static String oneTwo(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() % 3 == 0) {
            for (int i = 0; i < str.length(); i += 3) {
                char c = str.charAt(i);
                stringBuilder.append(str.substring(i + 1, i + 3)).append(c);
            }
        } else if (str.length() > 3) {
            for (int i = 0; i < str.length() - 3; i += 3) {
                char c = str.charAt(i);
                stringBuilder.append(str.substring(i + 1, i + 3)).append(c);
            }
        }
        return stringBuilder.toString();
    }
}
