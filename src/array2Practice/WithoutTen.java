package array2Practice;
/*
Return a version of the given array where all the 10's have been removed. The remaining elements should shift left
owards the start of the array as needed, and the empty spaces a the end of the array should be 0.
So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
 */
public class WithoutTen {
    public static void main(String[] args) {
        int[] test = withoutTen(new int[]{1, 10, 10, 2});
        int[] test1 = withoutTen(new int[]{10, 2, 10});
        for (int i : test) System.out.println(i);
        System.out.println();
        for (int i : test1) System.out.println(i);
    }

    public static int[] withoutTen(int[] nums) {
        int[] newArr = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                newArr[j] = nums[i];
                j++;
            }
        }
        return  newArr;
    }
}
