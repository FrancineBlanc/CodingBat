package array2Practice;

public class Lucky13 {
    public static void main(String[] args) {
    }

    public static boolean lucky13(int[] nums) {
        for (int i : nums) {
            if (i == 3 || i == 1) return false;
        }
        return true;
    }
}
