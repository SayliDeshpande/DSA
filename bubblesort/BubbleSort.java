import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[]){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped= false;
            for (int j = 1; j < arr.length-i; j++) { // in every pass, greatest element will be at last position hence ignore the same in next steps, so the condition  (length-i)
                if(arr[j] < arr[j-1]){
                    //swap j with j-1
                    int tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                    swapped=true;
                }
            }
            if(!swapped) // if swappping is not happening that means array is sorted so break
                break;

        }
    }
}
