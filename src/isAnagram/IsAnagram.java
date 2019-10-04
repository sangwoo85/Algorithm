package isAnagram;

import java.util.ArrayList;
import java.util.List;

public class IsAnagram {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		String s = "anagram";
		String t = "nagaram";
		
		System.out.println("result : "+solution.isAnagram(s, t));
	}
}

class Solution{
	
	
	public boolean isAnagram(String s, String t) {
		
		int[] arr = new int[26];
		
		if(s.length() != t.length()) {
			return false;
		}
		
		for(int i = 0; i <s.length();i++) {
			
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
		}
		
		for(int i =0; i < arr.length;i++) {
			
			if(arr[i]!=0) {
				return false;
			}
		}
		return true;
		
	}
}