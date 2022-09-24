import java.util.Arrays;

public class QuickSort {
    /*
    Idea of quick sort is , pick a pivot element and try to place that pivot ele at the correct position.
    After that make recursion calls to check if all the elements at the right of pivot element are less than pivot
    and all elements at left are greater than pivot.
     */
    public static void main(String[] args) {
        int[] arr = {4,5,2,7,3,9,1,0,6};

        quickSortRecursive(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSortRecursive(int[] arr, int low, int high) {
        if(low >= high)
            return;
        // pick a pivot and place at correct position

        int start= low;
        int end= high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];   // picking mid as pivot for quicksort

        while(start <= end) {
            // Run loop till violation, when violated then swap


            // use start and end for swapping
            // use low and high to determine which part of array to work on

            // after placing pivot at correct index, first array will be (low, end) and right will be (start,high)
            while(arr[start] <= pivot) { // loop till condition satisfies, else swap
                start++;
            }
            while(arr[end] >= pivot) { // loop till condition satisfies, else swap
                end--;
            }

            if(start <= end){
                // swap
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
        }

        // swapping is done, now make recursive calls for two halves
        quickSortRecursive(arr, low, end);
        quickSortRecursive(arr, start, high);

    }


}
