package powerfulIntegers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class powerfulIntegers {

	public static void main(String[] args) {
		
		
		Solution solution = new Solution();
		
		int x = 2;
		int y = 1;
		int bound = 10;
		
		List<Integer> result = solution.powerfulIntegers(x, y, bound);
		
//		System.out.print("result : ");
//		for(int a : result) {
//			System.out.print(a+",");
//		}
		
		solution.powerfulIntegers2(x, y, bound);
	}
}
class Solution{
	
	public List<Integer> powerfulIntegers(int x, int y, int bound){
		
		int result = 0;
		List<Integer> resultList = new ArrayList<Integer>();
		boolean[] tmp = new boolean[bound+1];
		
		for(int i =0; i*i<=bound;i++) {
			result = 0;
			for(int j = 0;  j*j<=bound;j++) {
				result = (int)(Math.pow(x,i)+Math.pow(y, j))  ;	
				if(result<=bound && !tmp[result]) {
					tmp[result] =true;
					resultList.add(result);
				}		
			}	
		}	
		return resultList;
	}
	
	public List<Integer> powerfulIntegers2(int x, int y, int bound){
		
		List<Integer> result = new ArrayList<Integer>();
		boolean[] tmp = new boolean[bound+1];
		int sum = 0;
		
		for(int i =0; Math.pow(x, i)<=bound; i++) {
			sum =0;
			for(int j=0; sum<=bound;j++) {
				sum = (int)(Math.pow(x, i) + Math.pow(y, j));
				if(sum<=bound) {
				tmp[sum] = true;
					if(tmp[sum]) {
						continue;
					}
				}
			}	
		}		
		for(int i = 0; i<tmp.length;i++) {
			if(tmp[i]) {
				result.add(i);
			}
		}
		for(int a : result) {
			System.out.println(a);
		}
		return result;
		
	}
	
}
