package string3Practice;

/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the
chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 */
public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
    }

    public static int sumNumbers(String str) {
        int total = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
            if (!Character.isDigit(str.charAt(i)) && stringBuilder.length() > 0) {
                total += Integer.parseInt(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }
        if (!stringBuilder.isEmpty())  total += Integer.parseInt(stringBuilder.toString());
        return total;
    }
}
