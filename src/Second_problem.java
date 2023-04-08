import java.util.Scanner;

public class Second_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print(isPrime(number, number / 2));
    }

    /**
     * Checks whether the input number is a prime or composite.
     *
     * @param number the number to check for primality
     * @param i the divisor to start checking from
     * @return the string "Prime" if the number is prime, or "Composite" if it is composite
     */

    public static String isPrime(int number, int i) {
        if (i == 1) {
            return "Prime";
        } else if (number % i == 0) {
            return "Composite";
        } else {
            return isPrime(number, i - 1);
        }
    }
}
