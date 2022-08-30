package array2Practice;

public class More14 {
    public static void main(String[] args) {
    }

    public static boolean more14(int[] nums) {
        int numOnes = 0;
        int numFours = 0;

        for (int i= 0; i < nums.length; i++) {
            if (nums[i] == 1) numOnes++;
            if (nums[i] == 4) numFours++;
        }
        return numOnes > numFours;
    }
}
