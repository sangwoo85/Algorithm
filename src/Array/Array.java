package Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		// System.out.println(result);
		System.out.println("result2 " + servers2(1234222));

		System.out.println("====1===" + romance("IV"));

		System.out.println("----2---" + romance2("IV"));

	}

	public static int romance(String x) {
		int result = 0;
		char[] number = new char[x.length()];
		int[] intnum = new int[x.length()];

		for (int i = 0; i < x.length(); i++) {
			number[i] = x.charAt(i);
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			switch (number[i]) {
			case 'I':
				intnum[i] = 1;
				break;
			case 'V':
				intnum[i] = 5;
				break;
			case 'X':
				intnum[i] = 10;
				break;
			case 'L':
				intnum[i] = 50;
				break;
			case 'C':
				intnum[i] = 100;
				break;
			case 'D':
				intnum[i] = 500;
				break;
			case 'M':
				intnum[i] = 1000;
				break;
			default:
				intnum[i] = 0;
				break;
			}
		}

		for (int i = 1; i < intnum.length; i++) {
			if (intnum[i - 1] < intnum[i]) {
				intnum[i - 1] *= -1;
			}
			result += intnum[i - 1];
		}
		result += intnum[intnum.length - 1];
		return result;

	}

	// 조건 문자를 잘못 들어 오지 않는다.
	public static int romance2(String x) {

		int result = 0;
		x = x.toUpperCase();
		int[] intnum = new int[x.length() + 1];

		if (x.length() > 2) {
			
			for (int i = 0; i < x.length(); i++) {
				switch (x.charAt(i)) {
				case 'I':
					if (i != 0) {
						if (intnum[i] < intnum[i + 1] && intnum[i + 1] != 0) {
							intnum[i] = 1 * -1;
						} else {
							intnum[i] = 1;
						}
					} else {
						intnum[i] = 1 * -1;
					}

					break;
				case 'V':
					if (i != 0) {
						if (intnum[i] < intnum[i + 1] && intnum[i + 1] != 0) {
							intnum[i] = 5 * -1;
						} else {
							intnum[i] = 5;
						}
					} else
						intnum[i] = 5 * -1;
					break;
				case 'X':
					if (intnum[i] < intnum[i + 1] && intnum[i + 1] != 0) {
						intnum[i] = 10 * -1;
					} else {
						intnum[i] = 10;
					}
					break;
				case 'L':
					if (intnum[i] < intnum[i + 1] && intnum[i + 1] != 0) {
						intnum[i] = 50 * -1;
					} else {
						intnum[i] = 50;
					}
					break;
				case 'C':
					if (intnum[i] < intnum[i + 1] && intnum[i + 1] != 0) {
						intnum[i] = 100 * -1;
					} else {
						intnum[i - 1] = 100;
					}
					break;
				case 'D':
					if (intnum[i - 1] < intnum[i + 1] && intnum[i + 1] != 0) {
						intnum[i - 1] = 500 * -1;
					} else {
						intnum[i - 1] = 500;
					}
					break;
				case 'M':
					intnum[i] = 1000;
					break;
				default:
					intnum[i] = 0;
					break;
				}
				result += intnum[i];
			}
		} else {
			result += intnum[x.length() - 1];
		}

		return result;

	}

	public static int servers2(int x) {

		int result = 0;
		int thing = 1;

		if (x < 0) {
			x *= -1;
			thing = -1;
		}
		while (x / 10 > 0) {
			result = (result * 10) + x % 10;
			x = x / 10;
		}
		result = result * 10 + x;

		return result * thing;
	}

}
