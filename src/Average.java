public class Average {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        double sum=findAvg(arr,arr.length);
        double nofn=arr.length;
        System.out.println(sum/nofn);
    }
    /**
     * @ findAvg(int[] array,int counter)-finding average of array
     * @return average of array
     */
    public static int findAvg(int[] arr, int n) {
        if (n == 0) {//base case
            return 0;
        } else {//recursive case
            int sum;
            sum=arr[n-1]+findAvg(arr,n-1);
            return sum;
        }
    }
}
