public class PrintNumbers {
    public static void main(String[] args) {
        int n=10;
        fun(n);
        funRev(n);
    }
    private static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);               // note the sequence of function call and print, this is printing in sequence
        System.out.println(n);
    }

    private static void funRev(int n){
        if(n==0){
            return;
        }
        System.out.println(n);    // note the sequence of function call and print, this is printing in reverse
        funRev(n-1);
    }
}
