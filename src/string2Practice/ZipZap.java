package string2Practice;
/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */
public class ZipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zopzop"));
    }

    public static String zipZap(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
                stringBuilder.append(str.charAt(i - 1)).append(str.charAt(i + 1));
            }
//            } else if (str.charAt(i - 1) != 'z' && str.charAt(i + 1) != 'p') {
//                stringBuilder.append(str.charAt(i));
//            }
        }
        return stringBuilder.toString();
    }
}
