package array2Practice;
/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.
twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */

public class TwoTwo {
    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{4, 2, 2, 3}));
        System.out.println(twoTwo(new int[]{2, 2, 4}));
        System.out.println(twoTwo(new int[]{2, 2, 4, 2}));
    }

    public static boolean twoTwo(int[] nums) {
        boolean bool = true;
        if (nums.length == 1 && nums[0] == 2) return false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && i + 1 < nums.length){
                if (nums[i - 1] != 2 && nums[i + 1] != 2) bool = false;
            }
            else if (nums[i] == 2 && i + 1 == nums.length) {
               if (nums[i - 1] != 2) bool = false;
            }
        }
        return bool;
    }
}
