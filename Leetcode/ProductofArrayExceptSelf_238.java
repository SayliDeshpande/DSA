class ProductofArrayExceptSelf_238 {
    /*public int[] productExceptSelf(int[] nums) {
        // lets consider two arrays left and right
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int[] answer = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for(int i = 1 ; i < n ; i++){
            left[i] = nums[i - 1] * left[i - 1];
        }

        for(int i = n - 2 ; i >= 0 ; i--){
            right[i] = nums[i + 1] * right[i + 1];
        }

        for(int i = 0 ; i < n ; i++){
            answer[i] = left[i] * right[i];
        }
        
        return answer;
    }*/

    //optimized Solution
    public int[] productExceptSelf(int[] nums) {
        // lets consider two arrays left and right
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        int right = 1;

        for(int i = 1 ; i < n ; i++){
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        for(int i = n - 1 ; i >= 0 ; i--){
            answer[i] = answer[i] * right;
            right *= nums[i];
        }
        
        return answer;
    }


}
