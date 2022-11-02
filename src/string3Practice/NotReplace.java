package string3Practice;
/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceded or followed by a letter -- so for example the "is" in "this" does not
count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 */
public class NotReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
    }

    public static String notReplace(String str) {
        return str.replaceAll("\\bis\\b", "is not");
    }
}
