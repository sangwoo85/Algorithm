package reverse;

public class reverse {


	
	public static void main(String[] args) {
		Solution solution  = new Solution();
		
		char[] ex = {'h','e','l','l','o'}; 
				
		solution.reverseString(ex);
		
		for (char a : ex) {
			System.out.println(a);
		}
		
		
	}
	
	

}
class Solution{
	
	public void reverseString(char[] s) {
		
		char[] result = new char[s.length];
		result = s.clone();
		
		for(int i =s.length-1; i>=0;i--) {
			s[s.length-(i+1)] =result[i];
		}
		
		
	}
}
