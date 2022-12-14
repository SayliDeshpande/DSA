public class HouseRobber198 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
      /*  int maxmoney = Integer.MIN_VALUE;

        int i = 0;
        while(i < nums.length){
            int sum = 0;
            for(int j = i ; j< nums.length ; j+=2){
                sum += nums[j];
            }
            if (maxmoney < sum) maxmoney = sum;
            i++;
        }
        return maxmoney; */
        // dynamic programming  bottom-up approach
        int max = nums[0]; // base case
        for(int i = 0 ; i < nums.length ; i++){
            if(i > 2){
                nums[i] = Math.max(nums[i - 2], nums[i - 3]) + nums[i]; // Recurrence relation
            }else if (i > 1){
                nums[i] = nums[i - 2] + nums[i];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}

// time complexity : O(N)
// space complexity : O(1)
