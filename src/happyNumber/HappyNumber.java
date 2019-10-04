package happyNumber;

public class HappyNumber {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int n = 19;
		System.out.println("result : " + solution.isHappy(n));
	}
}

class Solution {

	public boolean isHappy(int n) {
		
		int result = 0;
		int num = 0;
		int mok = 1;
		
		for(;result<=1;) {
			num = result;
			result = 0;
			mok = 1;
			for(int k = 1;k<=1;) {
				k = num/mok;
				result += Math.pow(k, 2);
				mok = mok*10;
			}
			
		}
		if(result != 1) {
			return true;
		}
		return false;
	}
}