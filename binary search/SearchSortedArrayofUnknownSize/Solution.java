package SearchSortedArrayofUnknownSize;
/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */


public class Solution {
    public static void main(String[] args) {
        int[] secret = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(secret, target));
    }
    public static int search(ArrayReader reader, int target) {
      /*  int start = 0;
        int end = target - reader.get(0);

        if(reader.get(end) == target) return end;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(reader.get(mid) == target){
                return mid;
            }
            else if (reader.get(mid) < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;*/
        int hi = 1;
        while (reader.get(hi) < target) {
            hi = hi << 1;
        }
        int low = hi >> 1;
        while (low <= hi) {
            int mid = low+(hi-low)/2;
            if (reader.get(mid) > target) {
                hi = mid-1;
            } else if (reader.get(mid) < target) {
                low = mid+1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
