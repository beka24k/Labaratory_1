import java.util.Scanner;

public class EuclidAlgorythm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.print(euclideanAlgorithm(number, number2));
    }

    /**
     * finding GCD(n,m) by using euclid algorythm
     * @param n 1 number of algorythm
     * @param m 2 number of algorythm
     * @return solution of GCD(n,m) common number that divide for 2 numbers
     */
    public static int euclideanAlgorithm(int n, int m) {
        if (m == 0) {//base case
            return n;
        } else {//recursive case
            return euclideanAlgorithm(m, n % m);
        }
    }
}