class SumDigitsofStringAfterConvert {
  
  //leetcode problem : https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
  
    public int getLucky(String s, int k) {
        int sum=0;
        for(char ch : s.toCharArray()){
            int n = ch - 'a' + 1;
            sum+=(n%10)+addDigits(n/10);;
        }
        for(int i=k-1;i>0;i--){
            sum=addDigits(sum);
        }
        return sum;
    }

    public static int addDigits(int n){
        if(n==0)
            return 0;
        return (n%10)+addDigits(n/10);
    }
}
