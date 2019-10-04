package Hash_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

class Solution {
	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		String result = solution(participant, completion);
		System.out.println(result);
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		LinkedList<String> linked = new LinkedList<String>(Arrays.asList(participant));
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(participant));
		Vector<String> vector = new Vector<String>();

		
		return answer;
	}
}
