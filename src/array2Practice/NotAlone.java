package array2Practice;
/*
We'll say that an element in an array is "alone" if there are values before and after it, and those values are
different from it. Return a version of the given array where every instance of the given value which is alone is
replaced by whichever value to its left or right is larger.

notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]
 */
public class NotAlone {
    public static void main(String[] args) {
        int[] test = notAlone(new int[]{1, 2, 3}, 2);
        int[] test1 = notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2);
        int[] test2 = notAlone(new int[]{3, 4}, 3);
        int[] test3 = notAlone(new int[]{1, 1, 1, 2}, 1);

        for (int i : test) System.out.println(i);
        System.out.println();
        for (int i : test1) System.out.println(i);
        System.out.println();
        for (int i : test2) System.out.println(i);
        System.out.println();
        for (int i : test3) System.out.println(i);
    }

    public static int[] notAlone(int[] nums, int val) {
        int[] newArr = new int[nums.length];

        if (nums.length == 2) return nums;

        newArr[0] = nums[0];
        newArr[newArr.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                if (nums[i - 1] < nums[i + 1] && nums[i - 1] != val) {
                    newArr[i] = nums[i + 1];
                } else {
                    newArr[i] = nums[i - 1];
                }
            } else {
                newArr[i] = nums[i];
            }
        }
        return newArr;
    }
}
