public class SumOfN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));     // sum of numbers of given n till 1
    }

    private static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }
}
