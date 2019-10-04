package SumOfEvenNumberAfterQueries;

public class SumOfEvenNumberAfterQueries {

	
	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		int[] A = {1,2,3,4};
		int[][] queries = {
				{1,0},
				{-3,1},
				{-4,0},
				{2,3}
		};
		int[] result = solution.sumEvenAfterQueries(A, queries);
		System.out.print("result1 : ");
		for(int a : result) {
			
		System.out.print( a +" ");
		
		}
		System.out.println();
		
	}
}

class Solution{
	
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		
		int[] result = new int[A.length];
		int originSum = 0;
		
		for(int i : A) {
			if(i %2 ==0) {
				originSum += i;
			}
		}
		

		for(int i =0; i < queries.length; i++) {
			System.out.println("originSum : "+originSum);
			int oldNum = A[queries[i][1]];		
			int newNum = oldNum + queries[i][0];
			A[queries[i][1]] = newNum;
			
			if(oldNum %2 == 0) {
				originSum -= oldNum;
			}
			
			if(newNum %2 ==0) {
				originSum += newNum;
			}

			result[i] = originSum;
		
		}
		return result;

	}
	
}