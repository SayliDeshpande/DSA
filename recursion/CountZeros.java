public class CountZeros {
    public static void main(String[] args) {
        int n=10102;
        System.out.println(countZ(n));
    }
    public static int countZ(int n){
        int result=0;
            result= helper(n, 0);

        return result;
    }

    public static int helper(int n, int count){
        if(n==0)
            return count++;
        if(n%10==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
