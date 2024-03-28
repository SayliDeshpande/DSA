package ValidPerfectSquare;

public class Solution {
    public static void main(String[] args) {
        int num = 16; //14
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        long start = 2;
        long end = num / 2;
        while(start <= end){
            long mid = start + (end - start) / 2;
            if( mid * mid == num){
                return true;
            }
            else if (mid * mid > num){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
