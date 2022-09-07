import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionsort(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            // first find the max index and place it at correct position in the array.
            int last=arr.length-1-i;
            int maxIndex = getMaxIndex(arr, 0,last);  // first find the max index
            swap(arr, maxIndex, last);                      //place at correct position

        }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max= start;
        for (int i = start; i <= last; i++) {
            if(arr[max] < arr[i])
                max= i;

        }
        return max;
    }

    private static void swap(int[] arr, int maxIndex, int last) {

        int temp = arr[maxIndex];
        arr[maxIndex]= arr[last];
        arr[last]= temp;
    }
}
