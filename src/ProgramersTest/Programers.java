package ProgramersTest;

import java.util.Arrays;

public class Programers {

	
	public static void main(String[] args) {
		
		Solution solution  = new Solution();
		
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		int[] result = solution.solution(arr, divisor);
		
//		for(int a : result) {
//			System.out.println(a);
//		}
		
		System.out.println("result2 : " +solution.solution2(123));
		System.out.println(223/1000);
	}
}


class Solution{
	
	
	  public int[] solution(int[] arr, int divisor) {
	      
		  int[] answer = new int[arr.length];
	      int count = 0;
	      
	      Arrays.sort(arr);
	      
	      for(int i =0; i<arr.length; i++) {
	    	  if(arr[i] %divisor ==0) {
	    		 answer[count] = arr[i];
	    		 count++;
	    	  }  
	      }
	      if(count == 0 ) {
	    	  answer[0] = -1;
	      }
	      int[] result = new int[count];
	      for(int i =0; i < result.length;i++) {
	    	  result[i] = answer[i];
	      }
	      return result;
	  }
	  
	  public int solution2(int n) {
		  
		  int answer = 0;
		  
		  if(n <10 ) {
			  return n;
		  }
		  
		  for(int i = 100000000; i>=1; i=i/10) {
			  System.out.println(i);
			  if(n / i >0) {
				  answer += n/i;
			  }
			  n = n%i;
		  }
//		  answer += n;
		  
		  return answer;
	  }
}
