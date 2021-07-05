public class FindNumberOfDigits {

    public static void main(String args[]){

        int number = 1234567;

        /* get the log10 of the number number and add a 1 */
        int no =  (int) Math.floor(Math.log10(number)) + 1;

        System.out.println(no);
    }
}
