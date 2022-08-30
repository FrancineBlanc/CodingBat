package array2Practice;

public class Has12 {
    public static void main(String[] args) {
    }

    public static boolean has12(int[] nums) {
        boolean oneSeen = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                oneSeen = true;
            }
            if (nums[i] == 2 && oneSeen) {
                return true;
            }
        }
        return false;
    }
}
