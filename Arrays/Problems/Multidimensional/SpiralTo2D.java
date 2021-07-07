public class SpiralTo2D {

    static int lastElementInSpiralArray(int mat[][]) {
        //we need to find the last element in O(1) time
        int rowBegin = 0, rowEnd = mat.length - 1;
        int colBegin = 0, colEnd = mat[0].length;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            rowBegin++;
            colEnd--;
            rowEnd--;
            colBegin++;
        }

        return mat[rowBegin-1][colBegin-1];
    }

    static int[][] getMatrix(int []spiral, int r, int c) {

        int matrix[][] = new int[r][c];

        int rowBegin = 0, rowEnd = r-1;
        int colBegin = 0, colEnd = c-1;
        int k=0;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            for(int i=colBegin; i<= colEnd; i++) {
                matrix[rowBegin][i] = spiral[k++];
            }

            rowBegin++;

            for(int i=rowBegin; i <= rowEnd; i++) {
                matrix[i][colEnd] = spiral[k++];
            }

            colEnd--;

            if (rowBegin <= rowEnd) {

                for(int i=colEnd; i >= colBegin; i--) {
                    matrix[rowEnd][i] = spiral[k++];
                }
            }

            rowEnd--;

            if (colBegin <= colEnd) {

                for(int i=rowEnd; i >= rowBegin; i--) {
                    matrix[i][colBegin] = spiral[k++];
                }
            }

            colBegin++;
        }

        return matrix;
    }

    static void prinTrix(int [][]mat, int r, int c) {
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){


        int mat[][] = getMatrix(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, 3);
        prinTrix(mat, 3, 3);

        System.out.println(lastElementInSpiralArray(mat));
    }
}
