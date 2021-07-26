import java.util.Scanner;

public class ScoreCombinations {
	
	static int getScore(int []individualPlayScores, int finalScore) {
		
		int dp[][] = new int[individualPlayScores.length+1][finalScore+1];
		
		for(int i=0; i<=individualPlayScores.length; i++) {
			dp[i][0] = 0;
		}
		
		for(int i=1; i<=finalScore; i++) {
			dp[0][i] = Integer.MAX_VALUE;
		}
		
		for(int i=1; i<= individualPlayScores.length; i++) {
			for(int j=1; j<= finalScore; j++) {
				dp[i][j] = (j >= individualPlayScores[i-1] ) ? Math.min(1 + dp[i][j - individualPlayScores[i-1]], dp[i-1][j]) : 
					dp[i-1][j];
 			}
		}
		
		return dp[individualPlayScores.length-1][finalScore];
	}
	
	public static void main(String[] args) {
		
		System.out.println(getScore(new int[] {1, 3, 7}, 7));
	}
}
