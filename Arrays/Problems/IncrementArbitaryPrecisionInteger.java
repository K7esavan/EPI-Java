
/*
 * array
 *  [1, 2, 9]
 *
 *  increment the array in such a way
 *  [1, 3, 0]
 *
 *  129 + 1
 *   = 130
 * */
import java.util.*;

public class IncrementArbitaryPrecisionInteger {

    static void incrementArray(List<Integer> array) {

        int last = array.size() - 1;
        int pos = last;

        while (array.get(pos) == 9 && pos != 0) {
            array.set(pos, 0);
            pos--;
        }

        array.set(pos, array.get(pos) + 1);

        array.forEach(System.out::print);
    }

    public static void main(String args[]){

        incrementArray(Arrays.asList(9, 0, 9));
    }
}
