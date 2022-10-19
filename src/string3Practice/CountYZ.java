package string3Practice;
/*

Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an
alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 */
public class CountYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
        System.out.println(countYZ("!!day--yaz!!"));
    }

    public static int countYZ(String str) {
        int counter = 0;
        if (str.isEmpty()) return counter;

        char c = str.toLowerCase().charAt(str.length() - 1);
        if (c == 'y' || c == 'z') {
            counter++;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isLetter(str.toLowerCase().charAt(i))) {
                if (str.toLowerCase().charAt(i - 1) == 'y' || str.toLowerCase().charAt(i - 1) == 'z') {
                    counter++;
                }
            }
        }
        return counter;
    }
}
