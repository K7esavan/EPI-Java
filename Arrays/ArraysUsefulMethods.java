import java.util.*;

public class ArraysUsefulMethods {

    public static void main(String args[]){

        List<Integer> array = new ArrayList<>(Arrays.asList(20, 10, 30, 50, 40)); //asList

        int index = Arrays.binarySearch(new int[]{20, 30}, 20); //binarySearch for array

        /* TODO: well know the fact => binary search has to be done to sorted collections or arrays if not it messes you up */
        array.sort(Integer::compareTo);
        int index2= Collections.binarySearch(array, 40);

        System.out.println(index2);

        //swaping elements using collections
        Collections.swap(array, 0, array.size()-1);

        //max and min elements
        int max = Collections.max(array);
        int min = Collections.min(array);

        System.out.println( max );
        System.out.println( min );

        //another very useful method is rotate
        Collections.rotate(array, 2);


        //suppose we want to simply initialize an array
        List<Integer> all10s;
        all10s = Collections.nCopies(5, 10);

        System.out.println(all10s);
    }
}
