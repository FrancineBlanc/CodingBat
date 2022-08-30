package warmUp2;

public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }

    public static String stringSplosion(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.substring(0, i + 1));
        }
        return stringBuilder.toString();
    }
}
