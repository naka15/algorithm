package leetcode.easy;

/**
 * Created by jh.choi on 2020-07-22.
 */
public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
	}
	public static boolean isPalindrome(int x) {
		int r = x;
		StringBuilder sb = new StringBuilder("");
		if (x < 0) {
			return false;
		}
		while (x>=0) {
			int t = x%10;
			sb.append(String.valueOf(t));
			x /= 10;
			if ( x == 0) {
				break;
			}
		}
		if (sb.toString().equals(String.valueOf(r))) {
			return true;
		}
		return false;
	}
}
