package logic2;
/*Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19

 */
public class BlackJack {
    public static void main(String[] args) {
        System.out.println(blackjack(19,21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
    }

    public static int blackjack(int a, int b) {
        if (a >= 22 && b >= 22) return 0;

        int aDiff = Math.abs(a - 21);
        int bDiff = Math.abs(b - 21);

        if (aDiff < bDiff && a <= 21) {
            return a;
        } else if (a > 21) {
            return b;
        }

        if (bDiff < aDiff && b <= 21) {
            return b;
        } else {
            return a;
        }
    }

    public static int blackjackCodingBat(int a, int b) {
        int aVal = a;
        if (aVal > 21) {
            aVal = 0;
        }
        int bVal = b;
        if (bVal > 21) {
            bVal = 0;
        }

        // Now it works to just return whichever is larger.
        if (aVal > bVal) {
            return aVal;
        }
        else {
            return bVal;
        }

        // You can write a very short version of this same strategy
        // using the "ternary operator" ?: and Math.max()
    }
}
