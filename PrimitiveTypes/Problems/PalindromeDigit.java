public class PalindromeDigit {

    static boolean bestWayOfPalindrome(long number) {
        //first find number of digits in that number
        int n = (int) (Math.floor(Math.log10(number))) + 1;

        //check first number with last number if not same return false;
        int msd = (int) Math.pow(10, n-1);

        for(int i=0; i < n/2; i++) {
            if ( (number / msd) != (number % 10) )
                return false;

            number %= 10; //removes the most significant bit
            number /= 10; //removes the least significant bit

            msd /= 100;
        }

        return true;
    }

    public static void main(String args[]){

        // This program checks whether the digit is palindrome or not
        // reverse is same as original
        ReverseDigits rev = new ReverseDigits();
        long digit = 123431;

        if ( rev.myWay(digit) == digit ) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
