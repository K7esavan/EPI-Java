import java.util.*;

public class ArrayBootCamp {

    /* this function puts even numbers first and odd numbers at last */
    static void evenOdd(List<Integer> array) {

        //we should have even numbered elements at first then odd number elements
        int oddElement = 0;

        for(int index=0; index < array.size(); index++) {
            if (array.get(index) % 2 != 0) {
                oddElement = array.get(index);
                array.remove(index);
                array.add(oddElement);
            }
        }

        array.forEach(System.out::println);
    }

    public static void main(String args[]){

        evenOdd(new ArrayList<Integer>(Arrays.asList(10, 10, 3, 4, 6, 9, 7)));
    }
}
