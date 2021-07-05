import java.util.*;

/*
 * We have an array of elements 0, 1 and 2
 * and we sort it such that 0 comes first 1 in middle 2 at last
 *
 * This algo do this in O(N) time complexity and O(1) space complexity
 *
 * */

public class DutchNationalFlag {

    static void sortArray(List<Integer> arr) {

        //We use 3 pointer variables and the following conditions must hold true always
        //  low , mid , high
        //
        //  [0 to low] => all 0
        //  [low+1 to mid] => all 1
        //  [mid+1 to high] => all 2

        int low = 0, mid = 0, high = arr.size() - 1;

        while (mid < high) {

            switch(arr.get(mid)) {
                case 0:
                    Collections.swap(arr, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    Collections.swap(arr, mid, high--);
                    break;
            }
        }
    }

    public static void main(String args[]){

        List<Integer> arr = Arrays.asList(1, 2, 1, 1, 0, 0, 2, 1, 0);
        sortArray(arr);
        System.out.println(arr);
    }
}
