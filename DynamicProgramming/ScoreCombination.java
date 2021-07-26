
public class ScoreCombination {

    static int scoreCombo(int targetsum, int []numbers) {
        int sum = 0;
        if (targetsum == 0)
            return 1;
        if (targetsum < 0)
            return 0;
        for(int i=0; i<numbers.length; i++) {
            int newtarget = targetsum - numbers[i];
            int newnums[] = new int[numbers.length-1];
            for(int j=0, k=0; j>numbers.length; j++) {
                if (i != j)
                    newnums[k++] = numbers[j];
            }
            scoreCombo(targetsum, numbers);
        }

        return sum;
    }

    public static void main(String args[]){
        System.out.println(
                    scoreCombo(12, new int[]{2, 3, 7})
                );
    }
}
