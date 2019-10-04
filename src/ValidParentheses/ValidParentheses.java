package ValidParentheses;

import java.util.ArrayList;

public class ValidParentheses {

	public static void main(String[] args) {
		boolean result;
		Manager stack = new Manager();
		result = stack.isVaild("{[wsdasdads()asd{ddd}]}");

		System.out.println(result);
	}

}

class Manager {

	char[] stack;

	Manager() {

	}

	public boolean isVaild(String s) {

		this.stack = new char[s.length()];

		int count = -1;
		
		for (int i = 0; i < stack.length; i++) {
			if (open(s.charAt(i))) {
				count++;
				stack[count] = s.charAt(i);
			}
			if (close(s.charAt(i)) && count > -1) {
				if (s.charAt(i) == reverse(stack[count])) {
					count--;
				} else {
					return false;
				}
			}
			else if(close(s.charAt(i)) && count==-1) {
				return false;
			}
		}
		if(count ==-1) {
			return true;
		}
		return false;
	}

	public boolean open(char ch) {

		switch (ch) {
		case '{':
			return true;
		case '(':
			return true;
		case '[':
			return true;
		default:
			return false;
		}
	}

	public boolean close(char ch) {

		switch (ch) {
		case '}':
			return true;
		case ')':
			return true;
		case ']':
			return true;
		default:
			return false;
		}

	}

	public char reverse(char ch) {

		switch (ch) {
		case '{':
			return '}';
		case '(':
			return ')';
		case '[':
			return ']';
		default:
			return 0;
		}

	}

}