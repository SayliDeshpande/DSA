class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
       if (n == 1) return cost[0];
        // using bottom up approach : consider array dp[i]. which will have final result
        int[] dp = new int[n];
        // we can start either at step 0 or 1 , so base conditions are: 
        dp[0] = cost[0];
        dp[1] = cost[1];
        // let's iterate others  
        for(int i = 2 ; i < n ; i++){
          //We start at either step 0 or step 1. The target is to reach either last or second last step, whichever is minimum.
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]); // recurrence relation 
        }
        return Math.min(dp[n -1], dp[n - 2]);
    }
    
}

// second approach 
// Bottom up computation - O(n) time, O(1) space
public int minCostClimbingStairs(int[] cost) {
	int n = cost.length;
	int first = cost[0];
	int second = cost[1];
	if (n<=2) return Math.min(first, second);
	for (int i=2; i<n; i++) {
		int curr = cost[i] + Math.min(first, second);
		first = second;
		second = curr;
	}
	return Math.min(first, second);
}
