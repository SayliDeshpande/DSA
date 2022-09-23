import java.util.Arrays;

public class MergeSortInPlace {
    //Merege sort steps:
    // 1. Divide given array into two parts
    //2. get both parts sorted using recursion
    //3. merger both parts into one : while merging, compare each and every elements


    public static void main(String[] args) {
        int arr[]={4,5,6,8,2,1,9,3,2,1};
        mergerSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergerSortInPlace(int[] arr,int start,int end) {
        if(end-start==1)
            return;
        int mid = start + (end - start)/2;
        mergerSortInPlace(arr,start,mid);
        mergerSortInPlace(arr,mid,end);
        mergeInPlace(arr,start,mid,end);
    }

    private static void mergeInPlace(int[] arr,int start, int mid, int end) {
        int[] result = new int[end-start];
        int i=start,j=mid,k=0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                result[k] = arr[i];
                i++;
            }else{
                result[k] = arr[j];
                j++;
            }
            k++;
        }

        //copy remaining elements

        while(i < mid){
            result[k]=arr[i];
            i++;
            k++;
        }
        while(j < end){
            result[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < result.length; l++) {
            arr[start+l]= result[l];
        }
    }


}
