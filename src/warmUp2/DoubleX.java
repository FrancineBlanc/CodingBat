package warmUp2;

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
        System.out.println(doubleX("xaxxx"));
        System.out.println(doubleX("aaaax"));
    }

    static boolean doubleX(String str) {
        if (str.length() < 2) return false;
        int firstX = str.indexOf('x');

        if (firstX != str.length() - 1 && str.charAt(firstX + 1) == 'x') return true;
        return false;
    }
}
