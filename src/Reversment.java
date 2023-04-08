import java.util.Scanner;

public class Reversment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {1, 4, 6, 2,};
        int number2 = sc.nextInt();
        reverse(number, 0, number2 - 1);
    }

    /**
     * Reverses the elements of an array between the given start and end indices.
     * @param arr the array to be reversed
     * @param start the starting index of the portion to be reversed
     * @param end the ending index of the portion to be reversed
     */
    public static void reverse(int[] arr, int start, int end) {
        if (end <= start) {//base case
            for (int j : arr) {
                System.out.print(j + " ");
            }

        } else {//recursive case
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start + 1, end - 1);
        }
    }
}