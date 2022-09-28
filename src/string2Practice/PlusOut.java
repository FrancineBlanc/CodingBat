package string2Practice;

/*Given a string and a non-empty word string, return a version of the original String where all chars have been replaced
by pluses ("+"), except for appearances of the word string which are preserved unchanged.


plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/

public class PlusOut {
    public static void main(String[] args) {
//        System.out.println(plusOut("12xy34", "xy"));
//        System.out.println(plusOut("12xy34", "1"));
//        System.out.println(plusOut("12xy34xyabcxy", "xy"));
        System.out.println(plusOut("--++ab", "++"));
    }

    public static String plusOut(String str, String word) {
        word = java.util.regex.Pattern.quote(word);
        return str.replaceAll("\\G((?:" + word + ")*+).", "$1+");
    }

}
