
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberOfSteps {
    public static void main(String[] args) {
        int num=123;
        System.out.println(countSteps(num));
    }

    public static int countSteps(int num) {
        int count=0,ans=0;
        count=helper(num,0);

        return count;

    }
    public static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n %2==0)
            return helper(n/2,count+1);
        return helper(n-1,count+1);
    }
}
