public class PowerFunction {

    public static void main(String args[]){

        int res = 1;
        int x = 5;
        int y = 3;

        //we have to compute pow(x, y);
        for(int i=0; i<y; i++) {
            res *= x;
        }

        System.out.println(res);
    }
}
