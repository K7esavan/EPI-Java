public class ReverseDigits {

    static long myWay(long number) {
        long res = 0;

        while (number != 0) {
            res = (res * 10) + (number % 10);
            number /= 10;
        }

        return res;

    }

    public static void main(String args[]){

        //we are given a number and we need to reverse it
        //the number can be negative also


        myWay(-12345);
    }
}
