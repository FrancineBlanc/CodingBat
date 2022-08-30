package warmUp1;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ba"));
    }

    public static String frontBack(String str) {
        if (str.length() == 1) return str;
        if (str.isEmpty()) return "";
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        return last + str.substring(1, str.length() - 1) + first;
    }
}
