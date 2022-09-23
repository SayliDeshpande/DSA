import java.util.Arrays;

public class MergeSort {
    //Merege sort steps:
    // 1. Divide given array into two parts
    //2. get both parts sorted using recursion
    //3. merger both parts into one : while merging, compare each and every elements
// Time Complexity : O(N * lon N)

    public static void main(String[] args) {
        int arr[]={4,5,3,2,1};
        arr= mergerSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergerSort(int[] arr) {
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;
        int[] first=mergerSort(Arrays.copyOfRange(arr,0,mid));
        int[] second=mergerSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                result[k] = first[i];
                i++;
            }else{
                result[k] = second[j];
                j++;
            }
            k++;
        }

        //copy remaining elements

        while(i<first.length){
            result[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            result[k]=second[j];
            j++;
            k++;
        }

        return result;
    }


}
