import java.util.Scanner;

public class Degreeofnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(degree(number,number2));
    }

    /**
     *
     * @param number the number that we should find degree(certain number)
     * @param number2 counter of the function decreasing by 1 to stop recurs(degree)
     * @return degree of input
     */
    public static int degree(int number,int number2){
        if(number2==0){//base class
            return 1;
        }else{//recursive case
            return number*degree(number,number2-1);
        }
    }

}

