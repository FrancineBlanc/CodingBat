package array2Practice;

public class No14 {
    public static void main(String[] args) {

    }

    public static boolean no14(int[] nums) {
        boolean seenOne = false;
        boolean seenFour = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                seenOne = true;
            }

            if (nums[i] == 4) {
                seenFour = true;
            }
        }

        return !seenOne || !seenFour;
    }
}
