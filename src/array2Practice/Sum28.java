package array2Practice;

public class Sum28 {
    public static void main(String[] args) {
    }

    public static boolean sum28(int[] nums) {
        int twosCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) twosCount += nums[i];
        }
        return twosCount == 8;
    }
}
