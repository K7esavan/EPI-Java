import java.util.Scanner;

public class CountMinimumCoins {
	 
	static int getMinimumCoinsForSum(int []coins, int sum) {

		int total_coins = coins.length;
		int dp[][] = new int[coins.length+1][sum+1];
		
		for(int rows = 0; rows <= total_coins; rows++) {
			dp[rows][0] = 0;
		}
		
		for(int col=1; col <= sum; col++) {
			dp[0][col] = Integer.MAX_VALUE;
		}
		
		
		for(int i=1; i<= total_coins; i++) {
			
			for(int curr_amount = 1; curr_amount <= sum; curr_amount++) {
				
				if (curr_amount >= coins[i-1]) {
					dp[i][curr_amount] = Math.min(1+dp[i][curr_amount - coins[i-1]],
							dp[i-1][curr_amount]);
				}
				else {
					dp[i][curr_amount] = dp[i-1][curr_amount];
				}
			}
		}
		
		
		return dp[total_coins-1][sum-1];
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numberOfCoins = scan.nextInt();
		int coins[] = new int[numberOfCoins];
		
//		System.out.println(numberOfCoins);
		for(int coin = 0; coin < numberOfCoins; coin++) {
			coins[coin] = scan.nextInt();
		}
		
		int sum = scan.nextInt();
		
		System.out.println(getMinimumCoinsForSum(coins, sum));
	}
} 