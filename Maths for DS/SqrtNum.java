public class SqrtNum {

    public static void main(String[] args) {
        int n=1000000;
        int ans = findsqrt(n);
        System.out.println(ans);
    }

    private static int findsqrt(int n) {

        int num=0;
        int start=0;int end=n;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(n/mid>=mid){
                start=mid+1;
                num=mid;
            }else{
                end=mid-1;
            }
        }
        return num;
    }

}
