// Leetocde : https://leetcode.com/problems/remove-element/description/

class RemoveElement {
  
    public static void main(String[] args){
      int[] nums = {0,1,2,2,3,0,4,2};
      int val = 2;
      System.out.println(removeElement(nums, val));
    }
    public int removeElement(int[] nums, int val) {

        // using two pointer technique, where one pointer is fast runner and other is slow

       int k = 0;
        for(int i =0; i < nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        } 
        
        return k;
    }
}
