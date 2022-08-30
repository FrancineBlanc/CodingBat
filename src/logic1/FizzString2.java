package logic1;
/*
Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is
divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by
both 3 and 5, use "FizzBuzz"
 */
public class FizzString2 {
    public static void main(String[] args) {
        System.out.println(fizzString2(1));
        System.out.println(fizzString2(2));
        System.out.println(fizzString2(3));
    }

    public static String fizzString2(int n) {
        if (n % 15 == 0) return "FizzBuzz!";
        if (n % 3 == 0) return "Fizz!";
        if (n % 5 == 0) return "Buzz!";
        return String.valueOf(n) + "!";
    }
}
