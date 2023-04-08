import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("5 problem solution- " + fibonacci(number));
    }

    /* finding the fibonacci number by certain index
     * @param number decreasing by 1 and 2 and sum of this making recurse
     * @return fibonacci number in certain index
     *  */
    public static int fibonacci(int number) {
        if (number <= 1) {//base class
            return number;
        } else {//recursive class
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}