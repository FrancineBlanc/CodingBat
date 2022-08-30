package array2Practice;

public class MatchUp {
    public static void main(String[] args) {
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        int diff = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i]) {
                if (nums1[i] > nums2[i]) {
                    diff = nums1[i] - nums2[i];
                    if (diff <= 2) {
                        count++;
                    }
                } else if (nums1[i] < nums2[i]) {
                    diff = nums2[i] - nums1[i];
                    if (diff <= 2) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
