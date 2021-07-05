import java.util.*;
import static java.util.Collections.*;

public class AdvancingThroughArray {

    static boolean canReachEnd(List<Integer> arr) {

        int furthest = 0;
        int last = arr.size()-1;

        for(int i=0; i<=furthest && i<arr.size(); i++) {
            if ( i + arr.get(i) > furthest) {
                furthest = i+arr.get(i);
            }

            if (furthest >= last) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]){

        System.out.println(
                    canReachEnd(Arrays.asList(1, 1, 5, 2, 1, 0, 0, 1, 3))
                );

        System.out.println(
                    canReachEnd(Arrays.asList(1, 1, 2, 5, 2, 1, 0, 0, 0, 3))
                );
    }
}
