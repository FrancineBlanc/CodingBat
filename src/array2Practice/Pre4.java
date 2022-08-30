package array2Practice;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come before
the first 4 in the original array. The original array will contain at least one 4.
Note that it is valid in java to create an array of length 0.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
 */
public class Pre4 {
    public static void main(String[] args) {
        int[] test = pre4(new int[]{1, 2, 4, 1});
        int[] test2 = pre4(new int[]{3, 1, 4});
        int[] test3 = pre4(new int[]{1, 4, 4});
        for (int i : test) System.out.println(i);
        for (int i: test2) System.out.println(i);
        for (int i: test3) System.out.println(i);
    }

    public static int[] pre4(int[] nums) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) {
                arrayList.add(nums[i]);
            } else {
                break;
            }
        }
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) arr[i] = arrayList.get(i);
        return arr;
    }
}
