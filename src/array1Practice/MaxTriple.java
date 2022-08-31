package array1Practice;
/*

Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */
public class MaxTriple {
    public int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        if (first > middle && first > last) {
            return first;
        } else if (middle > first && middle > last) {
            return middle;
        }
        return last;
    }
}
