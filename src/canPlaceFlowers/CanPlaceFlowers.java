package canPlaceFlowers;

public class CanPlaceFlowers {

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] flowerbed = { 0, 0, 1, 0, 0 };
		int n = 1;

		System.out.println("result : " + solution.canPlaceFlowers2(flowerbed, n));

	}
}

class Solution {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {

		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (n == 0) {
				return true;
			} else if (count == 3 && flowerbed[i] == 0) {
				n--;
				count = 1;
			} else if (count == 3) {
				n--;
				count = 0;
			} else if (flowerbed[i] == 0) {
				count++;
			} else if (flowerbed[i] == 1) {
				count = 0;
			}
		}
		System.out.println(n);
		if (n < 0) {
			return false;
		}

		return false;
	}

	public boolean canPlaceFlowers2(int[] flowerbed, int n) {

		int count = 0;
		if (flowerbed[0] == 0) {
			count = 1;
		}
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				count++;
				if(i==flowerbed.length-1) {
					count++;
				}
				if(count == 3) {
					n--;
					count = 1;
				}
			}else {
				count = 0;
			}
		}
		System.out.println(n);
		if (n == 0) {
			return true;
		} else
			return false;
	}

}
