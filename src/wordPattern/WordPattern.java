package wordPattern;

public class WordPattern {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		String pattern =  "abba";
		String str = "aa bb aa aa";
		
		System.out.println(" result : "+solution.wordPattern(pattern, str));
	}
	
}
class Solution {
	public boolean wordPattern(String pattern, String str) {
		
		String[] arr = str.split(" ");
		int[] intPattern = new int[arr.length]; 
		
		if(arr.length != pattern.length()) {
			return false;
		}
		char[] charr = str.toCharArray();
		for(int i =0; i < pattern.length();i++) {
			
		}
		for(int i =1; i < pattern.length();i++) {
			if(pattern.charAt(i)==pattern.charAt(i-1)) {
				if(!arr[i].equals(arr[i-1])) {
					return false;
				}
			}else
				if(arr[i].equals(arr[i-1])) {
					return false;
				}
		}
		return true;
	}
}