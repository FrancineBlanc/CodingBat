package array2Practice;

public class Only14 {
    public static void main(String[] args) {

    }

    public static boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4 && nums[i] != 1) return false;
        }
        return true;
    }
}

