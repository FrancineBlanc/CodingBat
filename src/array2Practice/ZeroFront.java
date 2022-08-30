package array2Practice;
/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are
grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1}
becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
 */
public class ZeroFront {
    public static void main(String[] args) {
        int[] test1 = zeroFront(new int[]{1, 0, 0, 1});
        int[] test2 = zeroFront(new int[]{0, 1, 1, 0, 1});
        int[] test3 = zeroFront(new int[]{1, 0});

        for (int i : test1) System.out.println(i);
        System.out.println();
        for (int i : test2) System.out.println(i);
        System.out.println();
        for (int i : test3) System.out.println(i);
    }

    public static int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }
}
