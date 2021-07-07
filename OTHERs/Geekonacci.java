public class Geekonacci {

    static int geekonacci(int a, int b, int c, int N) {

        // 4th term is say d => a + b + c
        // 5th term => b + c + d
        // 6th term => c + d + e
        // find N th term
        int arr[] = new int[N+1];
        arr[0] = a; arr[1] = b; arr[2] = c;

        for(int i=3; i<=N; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        return arr[N-1];
    }

    public static void main(String args[]){

        System.out.println( geekonacci(1, 2, 3, 5) );
        //4th => 6
        //  2 3 6 => 11 (5th)
        //    3 6 11 => 20 (6th)
    }
}
