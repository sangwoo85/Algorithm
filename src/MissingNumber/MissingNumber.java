package MissingNumber;

public class MissingNumber {

	public static void main(String[] args) {
	
		Solution solution = new Solution();
		
		int[] ex = {3,0,1};
		System.out.println("result : "+ solution.missingNumber(ex));
		
	}
}
class Solution{
	
	public int missingNumber(int[] numbers) {
		
		int sum = 0,
			total = 0;
		for(int i =0; i < numbers.length;i++) {
			sum += numbers[i];
			total += i+1;
		}
		return total-sum;
	}
}
