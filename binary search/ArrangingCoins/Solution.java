package ArrangingCoins;

public class Solution {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        long curr;
        while(start <= end){
            long mid = start + (end - start) / 2;
            curr = mid * (mid + 1) / 2;
            if(curr == n) return (int) mid;
            if( n < curr){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return (int) end;
    }
}
