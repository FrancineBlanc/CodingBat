package warmUp2;

public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
        System.out.println(countXX("abc"));
    }

    static int countXX(String str) {
        int numberX = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x' ) {
                numberX++;
            }
        }
        return numberX;
    }

}
