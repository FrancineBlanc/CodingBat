package string3Practice;
/*
Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */
public class MaxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
        System.out.println(maxBlock("xyzz"));
    }

    public static int maxBlock(String str) {
        int count = str.isEmpty() ? 0 : 1;
        int max = count;

        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c == str.charAt(i + 1)) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        return max;
    }



}
