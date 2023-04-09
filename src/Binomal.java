import java.util.Scanner;

public class Binomal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.print(factorial(number)/(factorial(number-number2)*factorial(number2)));//solve the problem by formula
    }

    /**
     * finding the factorial
     * @param n certain number that n!
     * @return factorial of number
     */
    public static int factorial(int n) {
        if (n == 0 ) {//base case
            return 1;
        } else {//recursive case
            return (n * factorial(n - 1));
        }
    }
}

