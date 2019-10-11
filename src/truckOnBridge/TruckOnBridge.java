package truckOnBridge;

import java.util.ArrayList;
import java.util.List;

public class TruckOnBridge {

	public static void main(String[] args) {
		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println(list.get(i).data);
//		}
//		
//		list.remove(2);
//		for(int i = 0; i < 2; i++) {
//			System.out.println(list.get(i).data);
//		}
	}
	
}
class Solution {
	
	 public int solution(int bridge_length, int weight, int[] truck_weights) {
	        int answer = 0;
	        
	        
	        List<Integer> truckList = new ArrayList<Integer>();
	        int maxium = 0;
	        for(int a : truck_weights) {
	        	truckList.add(a);
	        }
	        while(truckList.size()!=0) {
	        	
	        	for(int i = 0; i < truckList.size();i++) {
	        		
	        		
	        	}
	        	
	        }
	        
	        return answer;
	    }
	
}
