public class FindUniqueNumber {

    public static void main(String[] args) {
        int[] nums  ={2,3,3,4,2,6,4};
        System.out.println(find(nums));
    }

    static int find(int[] nums){
      // idea is XOR entire array, XOR any number with itself gives Zero , and XOR any number with Zero gives same number
      // here when we XOR array samenumber ^ samenumber ==0 
      // 0 ^ remaining number = remaining number (which is unique)
        int unique=0;
        for(int n : nums){
            unique ^= n;
        }
        return unique;
    }
}
