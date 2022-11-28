
// problem : Given an m x n matrix, return all elements of the matrix in spiral order.
// https://leetcode.com/problems/spiral-matrix/description/

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }

    public static  List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> spiral = new ArrayList<>();
        int rowBegin=0;
        int rowEnd= matrix.length-1;
        int colBegin=0;
        int colEnd = matrix[0].length-1;

        while(rowBegin<= rowEnd && colBegin <= colEnd){
            // traverse right
            for(int col= colBegin ; col<=colEnd; col++){
                spiral.add(matrix[rowBegin][col]);
            }
            rowBegin++;
            // traverse down
            for(int row= rowBegin; row<=rowEnd; row++){
                spiral.add(matrix[row][colEnd]);
            }
            colEnd--;

            //traverse left, but before check if valid
            if(rowBegin <= rowEnd){
                for(int col=colEnd; col>=colBegin;col--){
                    spiral.add(matrix[rowEnd][col]);
                }
            }
            rowEnd--;
            if(colBegin <= colEnd){
                // traverse up
                for(int row=rowEnd; row>=rowBegin;row--){
                    spiral.add(matrix[row][colBegin]);
                }
            }
            colBegin++;
        }
        return spiral;
    }
}
