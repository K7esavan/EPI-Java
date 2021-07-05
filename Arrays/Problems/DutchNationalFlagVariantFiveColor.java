import java.util.*;
import static java.util.Collections.*;

public class DutchNationalFlagVariantFiveColor {

    static void dutchFlagAlgo(List<Integer> array) {

        int low = 0, mid1 = 0, mid2 = 0, mid3 = 0, high = array.size()-1;

        while (mid3 <= high) {

            switch(array.get(mid3)) {

                case 0:
                    swap(array, low++, mid3);
                    if(mid1 < low)
                        mid1++;
                    if(mid2 < mid1)
                        mid2++;
                    if(mid3 < mid2)
                        mid3++;
                    break;
                case 1:
                    swap(array, mid1++, mid3);
                    if(mid2 < mid1)
                        mid2++;
                    if(mid3 < mid2)
                        mid3++;
                    break;
                case 2:
                    swap(array, mid2++, mid3);
                    mid3++;
                    break;
                case 3:
                    mid3++;
                    break;
                case 4:
                    swap(array, mid3, high--);
                    break;
            }
        }

        array.forEach(s->System.out.print(s + " "));
    }

    public static void main(String args[]){

        dutchFlagAlgo(Arrays.asList(1, 2, 3, 3, 2, 1, 0, 0, 1, 0, 3, 3, 4, 4, 2, 2, 4, 1, 0, 4));
    }
}
