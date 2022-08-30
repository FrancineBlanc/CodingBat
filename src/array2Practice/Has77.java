package array2Practice;

public class Has77 {
    public static void main(String[] args) {

    }

    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7 && i < nums.length - 1 && nums[i + 1] == 7) {
                return true;
            }
            if (nums[i] == 7 && i < nums.length - 2 && nums[i + 2] == 7) {
                return true;
            }
        }
        return false;
    }
}
