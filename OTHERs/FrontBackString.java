public class FrontBackString {

    // "Hello" 'H' is 8 th from 'A' so we have to replace
    // this with 'Z' - 8 => 'S'
    static char getBackLetterFor(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('z' - (ch - 'a'));
        } else {
            return ' ';
        }
    }

    static String frontBack(String str) {

        String rs = "";
        for(char ch : str.toCharArray()) {
            rs  += "" + getBackLetterFor(ch);
        }
        return rs;
    }


    public static void main(String args[]){

        System.out.println( frontBack("gfg") );
    }
}
