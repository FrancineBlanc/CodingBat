package string2Practice;

public class XyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }

    public static boolean xyBalance(String str) {
        int xLastIndex = 0;
        int yLastIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            xLastIndex = str.lastIndexOf("x");
            yLastIndex = str.lastIndexOf("y");
        }
        if (str.isEmpty() || xLastIndex == -1) return true;
        return xLastIndex < yLastIndex;
    }

    public boolean xyBalanceCodingBat(String str) {
        // Find the rightmost y
        int y = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='y') y = i;
        }

        // Look at the x's, return false if one is after y
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='x' && i > y) return false;
        }
        return true;

        // Solution notes: this solution uses two loops, each written the simple
        // 0..length way. You could do it with a single reverse loop, noticing
        // if you see an x before a y. Or use lastIndexOf().
    }
}
