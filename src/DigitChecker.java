import java.util.Scanner;

public class DigitChecker {
    //main part of taking data from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int counter = number.length() - 1;
        System.out.println(isDigit(number, counter));
    }

    /**
     * finding letter in upper or lower case to check stoke
     * @param number stroke that function check
     * @param counter counter to stop the recursion and make a base case
     * @return Yes if stroke without letter another way No
     */
    public static String isDigit(String number, int counter) {
        char c = number.charAt(counter);
        if (counter == 0) {//base case
            return "Yes";
        }
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            return "No";
        } else { //recursion case
            return isDigit(number, counter - 1);//recursion for making easier problem
        }
    }
}

