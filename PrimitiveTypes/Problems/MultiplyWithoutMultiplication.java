public class MultiplyWithoutMultiplication {

    static long add(long a, long b) {

        /* A simple explanation with 2 + 2
         *
         *      0 1 0
         *      0 1 0    (0 + 0 = 0) (1 + 1 = 10)
         *      -----
         *      1 0 0
         * */

        long A = a, B = b, sum = 0;
        long ak = 0, bk = 0, carryin = 0;
        int k = 1;

        while (A != 0 && B != 0) {
            ak = A & k;
            bk = B & k;

            long carryout = (ak & bk) | (ak & carryin) | (bk & carryin);
            sum |= (ak ^ bk ^ carryin);

            carryin = carryout << 1;
            k <<= 1;

            A >>>= 1; B >>>=1;
        }

        return sum | carryin;
    }

    //multiplication can be done via repeated addition but that is costlier in terms of bits
    static long multiply(long x, long y) {

        long sum = 0;
        while (x != 0) {
            // Examines each bit of x.
            if ((x <& 1) ! = 0) {
                sum = add(sum , y ) ;
            }
            x >>>= 1 ;
            y <<= 1 ;
        }
        return sum;
    }

    public static void main(String args[]){


    }
}
