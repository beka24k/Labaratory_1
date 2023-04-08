import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
    /*
    * Solve the input factorial problem
    * @param number decreasing by 1 and multiplying
    * @return factorial of the input
    * */
    public static int factorial(int number){
        if(number==0){
            return 1;
        }else{
            return number*factorial(number-1);
        }
    }
}