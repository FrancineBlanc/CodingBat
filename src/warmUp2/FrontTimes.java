package warmUp2;
/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is
there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"

 */
public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("Ab", 4));
    }

    public static String frontTimes(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
               stringBuilder.append(str).toString();
            }
        } else {
            String firstChars = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                stringBuilder.append(firstChars);
            }
        }
        return stringBuilder.toString();
    }
}
