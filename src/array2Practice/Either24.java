package array2Practice;

public class Either24 {
    public static void main(String[] args) {
    }

    public static boolean either24(int[] nums) {
        boolean seenFour = false;
        boolean seenTwo = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] == 4) {
                seenFour = true;
            }
            if (nums[i] == 2 && nums[i + 1] == 2) {
                seenTwo = true;
            }
        }
        return seenFour != seenTwo;
    }
}
