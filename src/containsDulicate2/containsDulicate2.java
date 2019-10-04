package containsDulicate2;

import java.util.HashMap;
import java.util.HashSet;

public class containsDulicate2 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 2, 3 };
		int k = 2;

		Solution solution = new Solution();
//		System.out.println("result : " + solution.containsDulicate2(nums, k));
//
//		System.out.println("result2 : " + solution.containsDulicate22(nums, k));
		System.out.println("result3 : " + solution.containsDulicate23(nums, k));

	}

}

class Solution {

	public boolean containsDulicate2(int[] nums, int k) {

		int max = nums[0];
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {

			if (nums[i - 1] <= nums[i]) {
				max = nums[i];
			}
			if (nums[i - 1] >= nums[i]) {
				min = nums[i];
			}
		}
		if (((max + 1) - (min + 1) + 1) == k) {
			return true;
		} else
			return false;
	}

	public boolean containsDulicate22(int[] nums, int k) {

		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = i + 1; j < nums.length; j++) {
				count++;
				if (nums[i] == nums[j]) {
					if (count == k) {
						return true;
					}
					break;
				}

			}
		}
		return false;

	}

	public boolean containsDulicate23(int[] nums, int k) {

		int num = 0;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			num = nums[i];
			if (hash.containsKey(num)) {
				if (i-hash.get(num) == k) {
					return true;
				}
			}
			hash.put(num, i);
		}
		return false;

	}
}
