/*class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        // Brute Force approach : Time complexity is BigO(nˆ2)
        // this can be optimized further
        // initialize maxArea to 0
        int maxArea = 0;
        int n = height.length;
        // consider two pointers 
        for(int i = 0 ; i < n ; i++){ // left pointer
            for(int j = i + 1 ; j < n ; j++){ // right pointer
                // calculate area =  height * width
                int currentArea = Math.min(height[i], height[j]) * (j - i);
                maxArea = Math.max(maxArea, currentArea);
            }
        }
        return maxArea;
    }
} */

class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        // Two pointer approach : Time complexity : BigO(n) : single pass
        // space complexity : BigO(n) // constant space is used
        // initialize maxArea to 0
        int maxArea = 0;
        int left = 0; // left pointer
        int right = height.length - 1; // right pointer
        while(left < right){
            int width = right - left;
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * width);

            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }
       
        return maxArea;
    }
}
