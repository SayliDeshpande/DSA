mport java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] ={5,4,3,2,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicsort(int[] arr) {
        // check swap and move
        int i=0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!= arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i]= arr[correctIndex];
        arr[correctIndex]=temp;
    }
}
