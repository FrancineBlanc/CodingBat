package array2Practice;

/*
For each multiple of 10 in the given array, change all the values following it to be that
multiple of 10, until encountering another multiple of 10.
So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]

 */
public class TenRun {
    public static void main(String[] args) {
        int[] nums = {2, 10, 3, 4, 20, 5};
        int[] nums2 = {10, 1, 20, 2};
        int[] result = tenRun(nums);
        int[] result2 = tenRun(nums2);
        for (int i : result) System.out.println(i);
        for (int i : result2) System.out.println(i);
    }

    public static int[] tenRun(int[] nums) {
        Integer temp = null;
        int[] newArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 != 0) {
                if (temp != null) {
                    newArr[i] = temp;
                } else {
                    newArr[i] = nums[i];
                }
            } else {
                temp = nums[i];
                newArr[i] = temp;
            }
        }
        return newArr;
    }
}
