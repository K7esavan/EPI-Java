import java.util.*;

public class ValidPartialSudoku {

    static boolean isValid(List<List<Integer>> sudoku) {

       HashSet<String> seen = new HashSet<>();

       for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {

                int current_val = sudoku.get(i).get(j);
                /* the add method in hashset return false if it is already present */
                if ( current_val != 0 && (
                     !seen.add(current_val + "Found in row" + i) ||
                     !seen.add(current_val + "Found in Col" + j) ||
                     !seen.add(current_val + "In grid" + i/3 + "x" + j/3)
                ))
                    return false;
            }
       }

       return true;
    }

    public static void main(String args[]){

        List<List<Integer>> sudoku = new ArrayList<List<Integer>>(); //you can simply use <> operator too
        sudoku.add(Arrays.asList(5, 3, 0, 0, 7, 0, 0, 0, 0));
        sudoku.add(Arrays.asList(6, 0, 0, 0, 9, 5, 0, 0, 0));
        sudoku.add(Arrays.asList(0, 9, 8, 0, 0, 0, 0, 6, 0));
        sudoku.add(Arrays.asList(8, 0, 0, 0, 6, 0, 0, 0, 3));
        sudoku.add(Arrays.asList(4, 0, 0, 8, 0, 3, 0, 0, 1));
        sudoku.add(Arrays.asList(7, 0, 0, 0, 2, 0, 0, 0, 6));
        sudoku.add(Arrays.asList(0, 6, 0, 0, 0, 0, 2, 8, 0));
        sudoku.add(Arrays.asList(0, 0, 0, 4, 1, 9, 0, 0, 5));
        sudoku.add(Arrays.asList(0, 0, 0, 0, 8, 0, 0, 7, 9));

        System.out.println(isValid(sudoku));
    }
}
