package recursion;

import java.util.Arrays;

public class TripleStepsRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(tripleStepsRecursion(2));
		
		System.out.println(tripleStepsMemo(37));

	}
	
	public static int tripleStepsRecursion(int n) {
		if(n < 0)
			return 0;
		else if(n == 0)
			return 1;
		else
			return tripleStepsRecursion(n - 1) + tripleStepsRecursion(n - 2) + tripleStepsRecursion(n - 3);
	}
	
	public static int tripleStepsMemo(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return tripleStepsMemo(n, memo);
		
	}
	
	public static int tripleStepsMemo(int n, int[] memo) {
		if(n < 0)
			return 0;
		else if(n == 0)
			return 1;
		else if(memo[n] > -1)
			return memo[n];
		else {
			memo[n] = tripleStepsMemo((n - 1), memo) + tripleStepsMemo((n - 2), memo) + tripleStepsMemo((n - 3), memo);
			return memo[n];
		}
	}
}
