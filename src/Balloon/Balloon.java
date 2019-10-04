package Balloon;

public class Balloon {

	public static void main(String[] args) {
	
		Solution solution = new Solution();
		
		String text = "loonbalxballpoon";
		
		
		
		System.out.println(solution.maxNumberOfBalloons(text));
		
	}
	
}

class Solution{
	
	
	
	public int maxNumberOfBalloons(String text) {
		
		int b = 0,
			a = 0,
			l = 0,
			o = 0,
			n = 0;
		
		for(int i = 0; i<text.length();i++) {		
			if(text.charAt(i)=='b') {
				b++;
			}else if(text.charAt(i)=='a') {
				a++;
			}else if(text.charAt(i)=='l') {
				l++;
			}else if(text.charAt(i)=='o') {
				o++;
			}else if(text.charAt(i)=='n') {
				n++;
			}
		}
		
		l = l/2;
		o = o/2;
		
		if(b==0 || a==0 || l==0 || o==0 ||n ==0) {
			return 0;
		}else if(b<=a && b <=l && b <=o && b <= n) {
			return b;
		}else if(a <= b && a<=l && a <=o && a <=n) {
			return n;
		}else if(l <=b && l <=a && l <=o && l <=n) {
			return l;
		}else if(o <=b && o <=a && o <=l && o <=n) {
			return o;
		}else 
			return n;
				

	}
	
}