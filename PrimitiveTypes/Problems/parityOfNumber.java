public class parityOfNumber {

    static boolean parityChecker(int number) {

        int cnt = 0;
        int temp = number;

        while (temp != 0) {
            cnt += temp & 1;
            temp >>>= 1;
        }

        if (cnt % 2 == 0 || cnt == 0)
            return true;
        else
            return false;
    }

    // the other way and prefered way is
    static int parityCheckerXOR(int number) {
        int parity = 0;

        while (number != 0) {
            parity = parity ^ (number & 1);
            number >>>= 1;
        }

        return parity;
    }

    //log n approach is
    static short parityCheckerXORLongNumbers(long x) {
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return (short) (x & 0x1);
    }


    public static void main(String args[]){

        // if there are even number of 1s then the parity is 0
        // else the parity is 1
        System.out.println(parityChecker(5));
        System.out.println(parityChecker(6));
        System.out.println(parityChecker(7));
        System.out.println(parityCheckerXORLongNumbers(7));
        System.out.println(parityCheckerXORLongNumbers(6));
    }
}
