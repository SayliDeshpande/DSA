package GuessNumberHigherorLower;

public class Solution {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));
    }
    public static int guessNumber(int n) {
        int start= 1;
        int end=n;
        while(start < end){
            int mid = start + (end - start)/2;
            if(guess(mid)==1){
                start = mid+1;
            }else{
                end= mid;
            }
        }
        return end;
    }

    private static int guess(int mid) {
        int pick = 6;
        if(mid > pick) return -1;
        else if (mid < pick) {
            return 1;
        }else return 0;
    }

}
