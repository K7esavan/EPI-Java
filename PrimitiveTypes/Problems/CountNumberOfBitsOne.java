public class CountNumberOfBitsOne {

    static int countOnesInInteger(final int number) {

        //copy the number inorder to save it
        int temp = number;
        //count variable to count number of 1s in that number
        int cnt  = 0;

        //if the number becomes 0 then there is no more ones in that number.
        while (temp != 0) {

            //and = 1 & 1 => 1; here it just check the last digit of temp with 1 if both are 1 we increment count;
            cnt += temp & 1;

            //TODO: here be careful if we use '>>' this also shift signed bits
            //hence we don't want that so we use '>>>' here
            temp >>>= 1;
        }

        return cnt;


        /*
         * Time Complexity : o(n)
         * since we are shifting the bits n times
         * n -> number of bits in that number
         * */
    }

    public static void main(String args[]){

    }
}
