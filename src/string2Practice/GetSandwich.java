package string2Practice;
/*
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */

public class GetSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }

    public static String getSandwich(String str) {
        int firstIndexOfBread = str.indexOf("bread");
        int lastIndexOfBread = str.lastIndexOf("bread");

        if (firstIndexOfBread == lastIndexOfBread) return "";

        return str.substring(firstIndexOfBread + 5, lastIndexOfBread);
    }
}
