package firstUniqueCharacterInaString;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		String s = "loveleetcode";
		
		System.out.println("result : "+solution.firstUniqueChar(s));
		
	}
}
class Solution {
	
	public int firstUniqueChar(String s) {
		
		int[] tmp = new int[26];
		
		for(int i =0; i < s.length();i++) {
			System.out.println(s.charAt(i)-'a');
			tmp[s.charAt(i)-'a']++;
		}
		for(int i = 0; i<s.length();i++) {
			if(tmp[s.charAt(i)-'a']==1) {
				return i;
			}
		}
		return -1;
	}
}