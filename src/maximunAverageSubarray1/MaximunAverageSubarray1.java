package maximunAverageSubarray1;

public class MaximunAverageSubarray1 {

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] nums = {1,12,-5,-6,50,3};
				
		int k = 4;
		System.out.println("result : " + solution.findMaxAverage(nums, k));
	}

}

class Solution {

	public double findMaxAverage(int[] nums, int k) {

		int tmpSum = 0;
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			tmpSum += nums[i];
			if (i > (k - 1)) {
				tmpSum -= nums[i - k];
				if (max < tmpSum) {
					max = tmpSum;
					System.out.println("max : " + max + " i " + i);
				}
				
				
			} else {
				System.out.println(" else");
				max = tmpSum;
			}
		}
		System.out.println(tmpSum);
		return (double) max / k;

	}
}