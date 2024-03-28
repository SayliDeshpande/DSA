package Sqrtx;

public class Solution {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
        System.out.println(mySqrtUsingFunc(x));
    }

    private static int mySqrtUsingFunc(int x) {
        return (int)Math.sqrt(x);
    }

    public static int mySqrt(int x) {
        int start = 1 ;
        int end = x;
        int n = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(x / mid >= mid){
                start = mid + 1;
                n = mid;
            }else{
                end = mid - 1;
            }
        }
        return n;

    }
}
