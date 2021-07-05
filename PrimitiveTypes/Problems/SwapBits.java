public class SwapBits {

    static long Swap(long x, int i, int j) {

        if ( ((x >>> i) & 1) != ((x >>> j) & 1)) {

            long bitmask = (1L << i) | (1L << j);
            x ^= bitmask;
        }

        return x;
    }

    public static void main(String args[]){

    }
}
