package array2Practice;

public class FizzArray {
    public static void main(String[] args) {

    }

    public static int[] fizzArray(int n) {
        int[] newArr = new int[n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = i;
        }
        return newArr;
    }
}
