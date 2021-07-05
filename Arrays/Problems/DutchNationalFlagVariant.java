import java.util.*;
import static java.util.Collections.*;

public class DutchNationalFlagVariant {

    static void dutchFlagAlgo(List<Integer> array) {
        int low = 0, mid1 = 0, mid2 = 0, high = array.size()-1;

        while (mid2 <= high) {

            switch(array.get(mid2)) {
                case 0:
                    swap(array, mid2, low++);
                    if (mid1 < low)
                        mid1++;
                    if (mid2 < mid1)
                        mid2++;
                    break;

                case 1:
                    swap(array, mid1++, mid2);
                    if (mid2 < mid1)
                        mid2++;
                    break;

                case 2:
                    mid2++;
                    break;

                case 3:
                    swap(array, mid2, high--);
                    break;
            }
        }

        array.forEach(s -> System.out.print(s + " "));
    }

    public static void main(String args[]){

        dutchFlagAlgo(Arrays.asList(3, 2, 2, 3, 1, 3, 0, 0, 1, 2, 3, 1, 0, 0, 1, 2));
    }
}
