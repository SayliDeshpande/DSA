public class SqrtNum {

    public static void main(String[] args) {
        int n=1000000;
        int ans = findsqrt(n);
        System.out.println(ans);
    }

    private static int findsqrt(int n) {
        //Applying binary search
       int num=0;
        int start=1;int end=n; // start should start with 1 else runtime error : divide by zero
        while(start<=end){
            int mid= start+(end-start)/2;
            if(n/mid>=mid){ // condition should be: number/mid>=mid not mid*mid>=num , latter gives wrong output for 1000000
                start=mid+1;
                num=mid;
            }else{
                end=mid-1;
            }
        }
        return num;
    }

}
