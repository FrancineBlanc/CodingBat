package array2Practice;

public class BigDiff {
    public static void main(String[] args) {
    }

    public static int bigDiff(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            } else if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest - smallest;
    }
}
