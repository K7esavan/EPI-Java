/*
 *  we have two bigger values
 *  normally we use BigInteger inorder to multiply and store that value
 *  but not all programming languages has it
 *  so do it in array
 *
 *  [1, 9, 3, 7, 0, 7, 7, 2, 1] * [-7, 6, 1, 8, 3, 8, 2, 5, 7, 2, 8, 7]
 *
 *  return an array which is multiplication of these value
 *  193707721 * -761838257287
 *
 * */

//TODO: incomplete
public class ArrayGradeSchoolAlgorithm {

    static List<Integer> multiply(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();

        int lastA = a.size()-1; int lastB = b.size()-1;
        int carry = 0;

        while (lastA < 0) {
            res = b.get(lastA) * a.get(lastA--);
            carry = res / 10;
        }

    }
}
