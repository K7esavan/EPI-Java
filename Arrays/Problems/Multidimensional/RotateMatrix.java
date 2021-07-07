public class RotateMatrix {

    static void prinTrix(int [][]mat) {
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void transpose(int [][]mat) {
        int temp = 0;
        int N = mat.length;
        for(int i=0; i<N; i++) {
            for(int j=i; j<N; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    static void reverseRows(int mat[][]) {
        int N = mat.length;

        for(int i=0; i<N; i++) {
            for(int j=0; j<mat[0].length/2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][N -j -1];
                mat[i][N-j-1] = temp;
            }
        }

    }

    static void reverseCols(int mat[][]) {
        int N = mat.length;

        for(int col=0; col < N; col++) {
            for(int row=0; row < N/2; row++) {
                int temp = mat[row][col];
                mat[row][col] = mat[N - row - 1][col];
                mat[N - row - 1][col] = temp;
            }
        }
    }

    static void rotate90Clock(int mat[][]) {
        transpose(mat);
        reverseRows(mat);
        prinTrix(mat);
    }

    static void rotate90aClock(int mat[][]) {
        transpose(mat);
        reverseCols(mat);
        prinTrix(mat);
    }

    public static void main(String args[]){


        int m[][] = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        prinTrix(m);
        System.out.println();
        rotate90Clock(m);
        System.out.println();
        m = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //I forget this earlier
        rotate90aClock(m);
    }
}
