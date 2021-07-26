
public class SubsetSum {

	//using Recursion
	static boolean isSubsetSum(int set[], int n, int sum) {
		
		if (sum == 0)
			return true;
		if (n == 0)
			return false;
		
		if (set[n-1] > sum)
			return isSubsetSum(set, n-1, sum);
		
		return isSubsetSum(set, n-1, sum) || 
				isSubsetSum(set, n-1, sum - set[n-1]);
		
		//Don't use this method because it's time
		//complexity is exponential
	}
	
	//tabulation 
	static boolean isPresent(int set[], int sum) {
		
		boolean dp[][] = new boolean[sum+1][set.length+1];
		
		for(int i=0; i<=set.length; i++) {
			dp[0][i] = true; 
		}
		
		for(int i=0; i<=sum; i++) {
			dp[i][0] = false;
		}
		
		for(int i=1; i<=sum; i++) {
			for(int j=1; j<=set.length; j++) {
				dp[i][j] = dp[i][j-1];
				
				if(i >= set[j-1])
					dp[i][j] = dp[i][j] || dp[i-set[j-1]][j-1];
			}
		}
		return dp[sum][set.length];
	}
	
	// recursion
	// here it allows repetition
	static boolean checkSubsetSum(int targetSum, int numbers[]) {
		
		if (targetSum == 0)
			return true;
		
		if (targetSum < 0)
			return false;
		
		for(int number : numbers) {
			int remainder = targetSum - number;
			
			if (checkSubsetSum(remainder, numbers))
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(
					isPresent(new int[] {3, 3}, 12)
				); //no repetition allowed
		System.out.println(
					checkSubsetSum(12, new int[] {3, 3})
				); //repetiton allowed
	}
}
