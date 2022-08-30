package array2Practice;

public class Sum13 {
    public static void main(String[] args) {
    }

    public static int sum13(int[] nums) {
        if (nums.length == 0) return 0;

        int sum = 0;
        for (int i= 0; i < nums.length; i++) {
            if (nums[i] == 13 || (i >= 1 && nums[i - 1] == 13)) {
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }
}
