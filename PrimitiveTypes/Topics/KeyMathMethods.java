public class KeyMathMethods {

    static int maxOfNelts(int[] arr) {

        int i=0, max=arr[i++];

        while (i < arr.length) {
            max = Math.max(max, arr[i++]);
        }

        return max;
    }

    public static void main(String args[]){

        Math.abs(-100);  // 100
        Math.ceil(2.3);  // 3.0
        Math.floor(2.6); // 2.0
        Math.max(10, 7); // 10
        Math.min(10, 7); // 7
        Math.pow(2, 6);  // 64.0
        Math.sqrt(124);  // 11.1355..

        System.out.println(maxOfNelts(new int[]{10, 2, 50, 60, 20, 10}));
    }
}
