import java.util.List;
import java.util.ArrayList;
/* This is exactly Subset Sum problem */

public class HowSu{

	static List<Integer> howSum(int targetSum, int numbers[]) {
		if (targetSum == 0)
			return new ArrayList<Integer>();
		if (targetSum < 0)
			return null;
		
		for(int num : numbers) {
			int rem = targetSum - num;
			List<Integer> remRes = howSum(rem, numbers);
			
			if (remRes != null) {
				remRes.add(rem);
				return remRes;
			}
		}
		return null;
 	}
	
	public static void main(String[] args) {
		
		System.out.println(
						howSum(7, new int[] {2, 3})
					);
	}
}
