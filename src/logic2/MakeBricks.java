package logic2;

public class MakeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        if (((big * 5) + small) >= goal) return true;
        int smallBricks = goal % 5;
        return small >= smallBricks;
    }

}
