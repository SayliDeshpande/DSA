public class MinimumFallingPathSum {
     public int minFallingPathSum(int[][] matrix) {
        // bottom up dynamic approach : 1st pass
        int[][] dp = new int [matrix.length+1][matrix.length+1];
        // start from first last row
        for(int row = matrix.length - 1 ; row >= 0 ; row--){
            for(int col = 0 ; col <= matrix.length - 1 ; col++){
                //chooses min element in the next row that is either directly below or diagonally left/right.
                if(col == 0){
                    dp[row][col] = Math.min(dp[row + 1][col], dp[row + 1][col + 1]) + matrix[row][col];
                }else if (col == matrix.length - 1){
                    dp[row][col] = Math.min(dp[row + 1][col], dp[row + 1][col - 1]) + matrix[row][col];
                }else{
                    dp[row][col] = Math.min(dp[row + 1][col],Math.min( dp[row + 1][col + 1], dp[row+1][col - 1])) + matrix[row][col];
                }
            }
        }

        int minFallingPathSum = Integer.MAX_VALUE;
        // 2nd pass
        for(int start = 0 ; start <= matrix.length - 1 ; start++){
            minFallingPathSum = Math.min(minFallingPathSum, dp[0][start]);
        }

        return minFallingPathSum;
    }
}
// time complexity : O(Nˆ2) : nested for loop takes (Nˆ2) times to fill the dp array. - O(Nˆ2)
//space complexity : O(Nˆ2) : additional space for Dp array of size Nˆ2
