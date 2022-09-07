import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,6,5,3,1,7,2,10,0,-9,-700,-12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        // idea is : sorting array partially, for every index i , we are inserting that index at correct position at LHS.
        //after every pass, LHS of an array is getting sorted.
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
