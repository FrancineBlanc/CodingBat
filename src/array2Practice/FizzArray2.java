package array2Practice;

public class FizzArray2 {
    public static void main(String[] args) {
    }

    public static String[] fizzArray2(int n) {
        String[] newArr = new String[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = String.valueOf(i);
        }
        return newArr;
    }
}
