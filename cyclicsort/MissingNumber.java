// https://leetcode.com/problems/missing-number/
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums ={0,1};
        int ans = missingNumber(nums); // using cyclic sort
        System.out.println("Missing number : "+ans);
    }

    static int missingNumber(int[] nums){
        int i =0;
        while(i< nums.length){
            int correctIndex= nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j)
                return j;
        }
        return nums.length;
    }

    static void swap(int[] nums, int i, int correctIndex) {
        int temp= nums[i];
        nums[i]= nums[correctIndex];
        nums[correctIndex]= temp;
    }
}
