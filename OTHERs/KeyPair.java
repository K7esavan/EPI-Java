import java.util.stream.*;
import java.util.*;

public class KeyPair {

    static boolean canWeGetSum(int arr[], int target) {
        //if any two value in arr adds to n return true
        //constrains:
        //O(n) time
        //O(n) space

        /* we can use hashmap and the logic
         *
         * target - arr[i] is in hashmap to obtain the o(n) time
         * */
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            map.put(arr[i]);
        }
    }
}
