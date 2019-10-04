package GreatestCommonDivisorOfString;

public class GreatestCommonDivisorOfString {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		String str1 = "ABCABC";
		String str2 = "ABC";
		
		
		
		solution.gcdOfString(str1, str2);
	}
}
class Solution{
	
	public String gcdOfString(String str1,String str2) {
		
		
		String t1 = "";
		String t2 = "";
		String tmp = "";

		if(str1.length() >= str2.length()) {
			t1 = str1;
			t2 = str2;
		}		
		
		int j = 0;
		
		for(int i =0; i<t1.length();i++) {	
			
			if(j == t2.length()-1 && i !=t1.length()-1){
				
				i--;
				j = 0;
				
			}else if(j == t2.length()-1 && i == t1.length()-1){
			
				
			}else if(t1.charAt(i)==t2.charAt(j)) {
				
				j++;
			}else 
				return "";
		}
		
		boolean flag = true;
		int tmpIndex = 0;
		String tmpT2 = t2;
		for(int i =0; i < t2.length();i++) {
			
			
			
		}
			
		
		
		
		return "";
	}
	
	public String pattenFind(String str) {
		
		String copyStr = str;
		
		
		for(int i = 0; i < str.length();i++) {
		
			
			
		}
		
		return "";
	}
	
}