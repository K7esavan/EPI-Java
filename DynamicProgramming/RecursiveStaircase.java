public class RecursiveStaircase {

    /*
     *  Recurrence Relation
     *
     *         {   0  if n < 0
     *  T(n) = {
     *         {   1  if n = 0
     *         {
     *         {   T(n-1) + T(n-2) otherwise
     *
     *
     *  This relation is similar to fibanocci series relation
     *
     *
     * */
    /* here the child can take 1 or 2 step only */

    static int /*returns number of ways */ staircase_ways(int steps) {
        if (steps < 0)
            return 0;

        if (steps == 0)
            return 1;

        return staircase_ways(steps-1) + staircase_ways(steps-2);
    }

    static int /*returns number of ways */ staircase_ways_o_n(int steps) {

        int cache[] = new int[steps+1];

        cache[0] = 1;
        cache[1] = 1;

        if (steps < 0)
            return 0;

        if (steps == 0)
            return 1;

        if (cache[steps] != 0)
            return cache[steps];

        return cache[steps] = staircase_ways(steps-1) + staircase_ways(steps-2);
        /* it can further be optimized similar to fibanocci series */
    }


    /* If the child can take 4 steps then the recurrence relation will be
     *
     *
     *      T(n) = T(n-1) + T(n-2) + T(n-3) + T(n-4)
     * */
}
