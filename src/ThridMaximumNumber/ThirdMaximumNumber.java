package ThridMaximumNumber;

import java.util.ArrayList;
import java.util.List;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		int[] nums = {2,2,2,1,1};
		System.out.println("result : "+solution.thirdMaximum(nums));
		
	}
}
class Solution {
	
	public int thirdMaximum(int[] nums) {
		
		if(nums.length<3) {
			return nums[nums.length-1];
		}
		List<Integer> list = new ArrayList<Integer>(10);
		for(int i = 0; i < nums.length;i++) {
			list.add(0);
		}
		System.out.println(list.size());
		int[] result = new int[3];
		for(int i =0; i < nums.length;i++) {
			
			if(list.get(2)<=nums[i]) {
				if(list.get(1)<=nums[i]) {
					if(list.get(0)<nums[i]) {
						list.add(0, nums[i]);
					}else {
						if(!list.contains(nums[i])) {
							list.add(1, nums[i]);
						}
					}
				}else {
					list.add(2, nums[i]);
				}
			}
			
		}

		
		return list.get(2);
	}
	public void copyArr(int[] arr) {
		
	}
	
	
	
}
