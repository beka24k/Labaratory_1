public class Main {
    public static void main(String[] args) {
        int[] arr = {10,1,32,3,45};
        int min=findMin(arr,arr.length);
        System.out.println(min);
    }
    /*
    * @findmin(int[] arr,int n)-finding minimum of array
    * return@ (integer) min of array
    * */
    public static int findMin(int[] arr, int n){
        if (n ==1){//base case
            return arr[0];
        }else{//recursive case
            int min=findMin(arr,n-1);
            return Math.min(min,arr[n-1]);

        }
    }
}