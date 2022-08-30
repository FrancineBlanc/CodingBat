package warmUp1;

public class In3050 {
    public static void main(String[] args) {
        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
    }

    public static boolean in3050(int a, int b) {
        boolean aRange = a >= 30 && a <= 40;
        boolean aRangeTwo = a >= 40 && a <= 50;

        boolean bRange = b >= 30 && b <= 40;
        boolean bRangeTwo = b >= 40 && b <= 50;

        return (aRange && bRange) || (aRangeTwo && bRangeTwo);
    }
}
