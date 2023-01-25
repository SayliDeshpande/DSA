class RegularExpressionMatching_10 {
    public boolean isMatch(String s, String p) {
        //bottom up approach : dynamic programming 
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = true;

        for(int i = s.length() ; i >= 0 ; i--){
            for(int j = p.length() - 1 ; j >= 0 ; j--){
                boolean first_match = (i < s.length() && (s.charAt(i) == p.charAt(j) ||
                p.charAt(j) == '.'));
                if(j + 1 < p.length() && p.charAt(j + 1) == '*'){
                    dp[i][j] = dp[i][j + 2] || first_match && dp[i + 1][j];
                }else{
                    dp[i][j] = first_match && dp[i + 1][j + 1];
                }

            }
        }
        return dp[0][0];
    }
}
/*
Complexity Analysis

Time Complexity: Let T,P be the lengths of the text and the pattern respectively. The work for every call to dp(i, j)
for i=0,...,Ti=0, ... ,Ti=0,...,T; j=0,...,Pj=0, ... ,Pj=0,...,P is done once, and it is O(1)O(1)O(1) work. 
Hence, the time complexity is O(TP)

Space Complexity: The only memory we use is the O(TP) boolean entries in our cache. Hence, the space complexity is O(TP)
*/
