package array2Practice;

public class Sum67 {
    public static void main(String[] args) {

    }

    public static int sum67(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 0;
        boolean addNumber = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                addNumber = false;
            }
            if (addNumber) {
                count += nums[i];
            }
            if (nums[i] == 7) {
                addNumber = true;
            }
        }
        return count;
    }
}
