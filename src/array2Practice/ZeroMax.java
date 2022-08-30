package array2Practice;
/*
Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right
of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
 */

public class ZeroMax {
    public static void main(String[] args) {
//        int[] arr = zeroMax(new int[]{0, 5, 0, 3});
//        int[] arr2 = zeroMax(new int[]{0, 4, 0, 3});
        int[] arr3 = zeroMax(new int[] {0, 1, 0});
        for (int i : arr3) System.out.println(i);

    }

    public static int[] zeroMax(int[] nums) {
        int largest = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0 && largest == 0 && nums[i] % 2 != 0) {
                largest = nums[i];
            } else if (nums[i] == 0) {
                nums[i] = largest;
            }
            if (nums[i] > largest && nums[i] % 2 != 0) {
                largest = nums[i];
            }
        }
        return nums;
    }
}
