import java.util.*;
import java.util.stream.*;

public class EnumerateAllPrimesToN {

    static boolean isPrime(int number) {
        int range = (int) Math.sqrt(number) + 1; //find a number S > sqrt(number)
        return number > 1 && IntStream.range(2, range)
                                      .noneMatch(index -> number % index == 0);
    }

    static List<Integer> getAllPrimes(int number) {
        if (number < 0)
            return null;

        List<Integer> res = new ArrayList<>();
        for(int i=1; i<number; i++) {
            if (isPrime(i))
                res.add(i);
        }

        return res;
    }

    public static void main(String args[]){

        for(int elt : getAllPrimes(138)) {
            System.out.print(elt + " ");
        }
    }
}
