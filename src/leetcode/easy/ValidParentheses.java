package leetcode.easy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

/**
 * Created by jh.choi on 2020-07-24.
 */
public class ValidParentheses {

	public static void main(String[] args) {

		boolean valid = isValid("");
		System.out.println(valid);
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(' || c == '[' || c == '{'){
				stack.push(s.charAt(i));
				continue;
			}
			if (stack.empty()) {
				return false;
			}
			if(c == ']') {
				if (stack.pop() != '['){
					return false;
				}
			}
			if(c ==')'){
				if(stack.pop() != '(')
					return false;
			}
			if(c =='}') {
				if(stack.pop() != '{') {
					return false;
				}
			}

		}

		return stack.empty() ? true : false ;
	}

}
