package string2Practice;
/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string.
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */
public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
        System.out.println(repeatSeparator("AAA", "", 0));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder stringBuilder = new StringBuilder();

        if (count == 0) return "";

        for (int i = 0; i < count - 1; i++) {
            stringBuilder.append(word);
            stringBuilder.append(sep);
        }
        stringBuilder.append(word);
        return stringBuilder.toString();
    }
}
