package warmUp1;

public class StartOz {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }

    public static String startOz(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() <= 2) return str;

        if (str.charAt(0) == 'o') {
            stringBuilder.append(str.charAt(0));
        }
        if (str.charAt(1) == 'z') {
            stringBuilder.append(str.charAt(1));
        }
        return stringBuilder.toString();
    }
}
