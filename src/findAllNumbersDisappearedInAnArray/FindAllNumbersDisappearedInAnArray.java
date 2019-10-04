package findAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

	public static void main(String[] args) {

		int[] nums = {4,3,2,7,8,2,3,1};
		
		Solution solution = new Solution();
//		List<Integer> result =solution.findAllNumbersDisappearedInAnArray(nums);
		List<Integer> result2 = solution.findAllNumbersDisappearedInAnArray2(nums);
		
//		result(result);
		result(result2);
	}
	public static void result(List<Integer> result) {
		System.out.print("result : ");
		for(int a : result) {
			System.out.print(a+",");
		}
		System.out.println();
	}

}
class Solution{
	
	public List<Integer> findAllNumbersDisappearedInAnArray(int[] nums){
		
		List<Integer> result = new ArrayList<Integer>();
		Arrays.sort(nums);
		int nowNum = 1;
		int nextNum =1;
		for(int a : nums) {
			System.out.print(a+",");
		}
		System.out.println();
		System.out.println("1,2,3,4,5,6,7,8");
		for(int i = 0; i<nums.length-1;) {
			nextNum = nums[i+1];
			if(nextNum - nowNum==1 ) {
				nowNum++;
				i++;
			}else if(nextNum == nowNum){
				i++;
			}
		
		}
			

		return result;
	}
	
	
	public List<Integer> findAllNumbersDisappearedInAnArray2(int[] nums){
		
		List<Integer> result = new ArrayList<Integer>();
		
		int[] arr = new int[nums.length+1];
		
		for(int i=0; i < nums.length;i++) {
			arr[nums[i]]++;
		}
		for(int i=1; i<arr.length;i++) {
			if(arr[i]==0) {
				result.add(i);
			}
		}
		return result;
	}
}