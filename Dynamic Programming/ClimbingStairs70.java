class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        // top down approach - dynamic programming - memoization
        return dp(n);
    }

    public int dp (int n){
        if(n <= 2) return n;
         // Instead of just returning dp(i - 1) + dp(i - 2), calculate it once and then
        // store it inside a hashmap to refer to in the future
        if (!memo.containsKey(n)) memo.put(n, dp(n - 1) + dp(n - 2));
        return memo.get(n);
    }

     /* Bottom-up approach - tabulation
     if (n == 1) return 1;
        int first = 1; // base case
        int second = 2; // base case
        for (int i = 3 ; i <= n ; i++){ // iterations
            int third = first + second;
            first = second;
            second = third;
        }
        return second;*/
}
