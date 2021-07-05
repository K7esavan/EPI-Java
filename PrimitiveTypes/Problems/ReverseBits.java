public class ReverseBits {

    static long reverse(long number) {
        long rev = 0;

        while (number != 0) {
            rev <<= 1;
            if ((number & 1) == 1)
                rev ^= 1;
            number >>= 1;
        }

        return rev;
    }

    public static void main(String args[]){

        System.out.println(reverse(2));
    }
}
