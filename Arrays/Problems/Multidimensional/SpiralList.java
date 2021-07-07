import java.util.*;

public class SpiralList {

    static List<Integer> getSpiralList(int [][]matrix) {

        List<Integer> spiralList = new ArrayList();

        int rowBegin = 0; int colBegin = 0; int rowEnd = matrix.length - 1; int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            for(int i=colBegin; i <= colEnd; i++) {
                spiralList.add(matrix[rowBegin][i]);
            }

            rowBegin++;

            for(int i=rowBegin; i <= rowEnd; i++) {
                spiralList.add(matrix[i][colEnd]);
            }

            colEnd--;

            if (rowBegin <= rowEnd) {

                for(int i=colEnd; i >= colBegin; i--) {
                    spiralList.add(matrix[rowEnd][i]);
                }
            }

            rowEnd--;

            if (colBegin <= colEnd) {

                for(int i=rowEnd; i >= rowBegin; i--) {
                    spiralList.add(matrix[i][colBegin]);
                }

            }

            colBegin++;
        }

        return spiralList;
    }


    public static void main(String args[]){

        int matrix[][] = new int[][] {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24 ,25}
        };


        System.out.println( getSpiralList(matrix) );
    }
}
