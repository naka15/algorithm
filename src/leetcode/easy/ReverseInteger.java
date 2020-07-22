package leetcode.easy;

import java.util.Stack;

/**
 * Created by jh.choi on 2020-07-22.
 */
public class ReverseInteger {
	public static void main(String[] args) {
		int reverse = reverse(1234567890);
		System.out.println(reverse);
	}

	public static int reverse(int x) {
		String s = String.valueOf(x);
		StringBuilder sb = new StringBuilder("");
		if (s.charAt(0) == '-') {
			sb.append(s.charAt(0));
			s= s.substring(1,s.length());
		}
		for (int i = s.length()-1; i >= 0 ; i-- ) {
			sb.append(s.charAt(i));
		}
		String result = sb.toString();
		try {
			int l = Integer.valueOf(result);
			return l;
		} catch(NumberFormatException e) {
			return 0;
		}
	}
}
