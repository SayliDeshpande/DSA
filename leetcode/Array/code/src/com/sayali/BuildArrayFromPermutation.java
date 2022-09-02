class Solution {
    public int[] buildArray(int[] nums) {
      // brute force approach
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]= nums[nums[i]];
        }
        return ans;
    }
}
