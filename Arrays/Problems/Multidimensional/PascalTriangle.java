import java.util.stream.*;
import java.util.*;

public class PascalTriangle {

    static List<List<Integer>> getPascalTriangle(int number) {

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0; i<number; i++) {
            List<Integer> current = new ArrayList<>();

            for(int j=0; j<=i; j++) {

                current.add(
                            (0 < j && j < i) ? triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j) : 1
                        );
            }

            triangle.add(current);
        }

        System.out.println(triangle);
        return triangle;
    }

    public static void main(String args[]){

        getPascalTriangle(10);

    }
}
