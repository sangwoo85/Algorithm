package numberComplement;

/**
 * 
 * 	Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

		Note:
		The given integer is guaranteed to fit within the range of a 32-bit signed integer.
		You could assume no leading zero bit in the integer’s binary representation.
		Example 1:
		Input: 5
		Output: 2
		Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
		Example 2:
		Input: 1
		Output: 0
		Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 
 *		n을 2진법으로 변경후 reverse 시켜서 10진수로 출력 하여라
 *
 *
 */

public class NumberComplement {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		int num = 5;
		
		System.out.println("result : "+solution.findComplement(num));
		
	}
}
class Solution {
	
	public int findComplement(int num) {
		
		int result =0;
		int m = 0;
		StringBuilder binary = new StringBuilder();
		
		while(num != 0) {
			
			if(num %2 ==0) {
				binary.append("1");
			}else {
				binary.append("0");
			}
			num = num/2;		
		}
		for(int i =0; i < binary.length();i++) {
			m = binary.charAt(i)-'0';
			
			result += m!=0?Math.pow((m*2), i):0;
		}
		return result;	
	}
}