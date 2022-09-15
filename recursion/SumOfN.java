public class SumOfN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));     // sum of numbers of given n till 1
         System.out.println(sumOfDigits(100001));   // sum of digits of input number
    }

    private static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }
    
     private static int sumOfDigits(int n){
        if(n==0)
            return 0;
        int digit = (n%10);
        return digit + sumOfDigits(n/10);
    }
}
