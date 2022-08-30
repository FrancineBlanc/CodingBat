package array2Practice;
/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */
public class ShiftLeft {
    public static void main(String[] args) {
        int[] numsArray = shiftLeft(new int[] {6, 2, 5, 3});
        int[] numsArray2 = shiftLeft(new int[] {1, 2});
        for (int i : numsArray) System.out.println(i);
        for (int i : numsArray2) System.out.println(i);
    }
    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 1 || nums.length == 0) return nums;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }
}
