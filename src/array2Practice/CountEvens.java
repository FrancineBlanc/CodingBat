package array2Practice;

public class CountEvens {
    public static void main(String[] args) {

    }

    public static int countEvens(int[] nums) {
        int evens_count = 0;
        for (int i : nums) {
            if (i % 2 == 0) evens_count ++;
        }
        return evens_count;
    }
}
