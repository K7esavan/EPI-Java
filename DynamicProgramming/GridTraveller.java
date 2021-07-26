import java.util.HashMap;
import java.util.Map;

public class GridTraveller {

    /* Returns number of ways in which we can travel a grid from start
     * to end only by chosing down and right path
     * */
    static int travelGrid(int m, int n, Map<String, Integer> travelled) {

        String key = m + ", " + n;

        if (travelled.containsKey(key))
            return travelled.get(key);

        if (m == 1 && n == 1)
            return 1;

        if (m == 0 || n == 0)
            return 0;

        travelled.put(key, travelGrid(m-1, n, travelled) + travelGrid(m, n-1, travelled));
        return travelled.get(key);
    }


    static long gridTravel(int m, int n) {
        long table[][] = new long[m+1][n+1];

        table[1][1] = 1;

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++){
                long current = table[i][i];
                if (j+1 <= n) table[i][j+1] += current;
                if (i+1 <= m) table[i+1][j] += current;
            }
        }
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        return table[m][n];
    }


    public static void main(String args[]){

        System.out.println(gridTravel(3, 3));
        System.out.println(gridTravel(18, 18));

    }
}
