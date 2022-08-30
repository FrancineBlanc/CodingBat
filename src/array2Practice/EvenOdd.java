package array2Practice;

/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers
come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the
given array, or make a new array.
 */

public class EvenOdd {
    public static void main(String[] args) {
        int[] input = {3, 3, 2};
        int[] result = evenOdd(input);
        for (int i : result) System.out.println(i);
    }

    public static int[] evenOdd(int[] nums) {
        int[] arranged = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arranged[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                arranged[j] = nums[i];
                j++;
            }
        }
        return arranged;
    }
}
