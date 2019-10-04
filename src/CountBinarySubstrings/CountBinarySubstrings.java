package CountBinarySubstrings;

public class CountBinarySubstrings {

	public static void main(String[] args) {

		Solution solution = new Solution();

		String s = "00100";

		System.out.println("result : " + solution.countBinarySubstrings(s));

		System.out.println("result2 : " + solution.countBinarySubstrings2(s));
	}

}

class Solution {

	public int countBinarySubstrings(String s) {

		int count = 0;
		int zero = 0, one = 0;
		int j = 0;
		int change = 0;
		for (int i = 0; i < s.length(); i++) {
			j = i;
			one = 0;
			zero = 0;
			change = 0;
			for (; j < s.length(); j++) {
				if (zero == one && zero != 0 && change <= 1) {
					break;
				} else if (s.charAt(j) == '0' && change <= 1) {
					zero++;
				} else if (s.charAt(j) == '1' && change <= 1) {
					one++;
				} else {
					break;
				}
				if (j < s.length() - 1) {
					if (s.charAt(j) != s.charAt(j + 1)) {
						change++;
					}
				}
			}
			if (zero == one && zero != 0) {
				count++;
			}
		}
		return count;
	}

	public int countBinarySubstrings2(String s) {
		
		char x = ' ';
		int xCount = 0;
		int otherCount = 0;
		int result = 0;
		for(int i =0; i < s.length();) {
			x = s.charAt(i);
			xCount = 0;
			otherCount = 0;
			for(int j=i; j < s.length();j++) {
				if(x==s.charAt(j) && otherCount ==0) {
					xCount++;
				}else if( x != s.charAt(j)) {
					otherCount++;
				}else {
					break;
				}
			}
			if(xCount ==0) {
				i += xCount;
			}else if(xCount>otherCount) {
					result +=otherCount;
					i += xCount;
			}else{
				result += xCount;
				i += xCount;
			}
		}
		
		return result;
	}

}
