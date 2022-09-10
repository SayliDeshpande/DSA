public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(6);
        System.out.println(ans);
    }

    static int fibo(int i) {
        if(i<2)
            return i;
        return fibo(i-1)+fibo(i-2);
    }

}
