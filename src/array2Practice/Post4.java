package array2Practice;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after
the last 4 in the original array. The original array will contain at least one 4.
Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */
public class Post4 {
    public static void main(String[] args) {
        int[] test = post4(new int[]{2, 4, 1, 2});
        int[] test2 = post4(new int[]{4, 1, 4, 2});
        int[] test3 = post4(new int[]{4, 4, 1, 2, 3});

        for (int i : test) System.out.println(i);
        for (int i : test2) System.out.println(i);
        for (int i : test3) System.out.println(i);
    }

    public static int[] post4(int[] nums) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 4) {
                arrayList.add(nums[i]);
            } else if (nums[i] == 4) {
                break;
            }
        }
        int[] arr = new int[arrayList.size()];
        int j = 0;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arr[j] = arrayList.get(i);
            j++;
        }
        return arr;
    }
}
