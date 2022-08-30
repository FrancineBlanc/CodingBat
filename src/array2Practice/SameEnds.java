package array2Practice;

/*
Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45,
99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range
0...nums.length inclusive.
sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
*/

import java.util.Arrays;

public class SameEnds {
    public static void main(String[] args) {
        int[] nums = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(nums, 1));
        System.out.println(sameEnds(nums, 2));
        System.out.println(sameEnds(nums, 3));
    }

    public static boolean sameEnds(int[] nums, int len) {
        int[] array1 = new int[len];
        int[] array2 = new int[len];

        for (int i = 0, j = nums.length - len; i < len; i++, j++) {
            array1[i] = nums[i];
            array2[i] = nums[j];
        }
        return Arrays.equals(array1, array2);
    }
}
