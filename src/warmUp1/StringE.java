package warmUp1;
/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class StringE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }

    public static boolean stringE(String str) {
        int numEs = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') numEs++;
        }
        return numEs >= 1 && numEs <= 3;
    }
}
