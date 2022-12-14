package string1Practice;
/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the
out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but
not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */
public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
    }

    public static String makeOutWord(String out, String word) {
        String first_two_chars = out.substring(0, 2);
        String last_two_chars = out.substring(2, 4);
        return first_two_chars + word + last_two_chars;
    }

}
