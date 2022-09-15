public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(facto(n));
    }

    private static int facto(int n){
        if(n>=1)                       //factorial of 0 and 1 is 1
            return 1;
        else
          return n * facto(n-1);
    }

}
