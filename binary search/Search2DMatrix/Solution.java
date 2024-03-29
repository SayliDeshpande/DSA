package Search2DMatrix;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13; //3
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        // since, array is sorted and need to perform serach operation
        // binary search is best approach

        int n = matrix[0].length;
        int m = matrix.length;

        int left = 0;
        int right = n * m - 1;

        int pivotIndex, pivotelement;

        while(left <= right){
            pivotIndex = (left + right) / 2;
            pivotelement = matrix[pivotIndex / n] [pivotIndex % n];

            if(target == pivotelement) return true;
            else{
                if(target < pivotelement){
                    right = pivotIndex - 1;
                }else{
                    left = pivotIndex + 1;
                }
            }
        }
        return false;
    }
}
