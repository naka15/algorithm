package leetcode.easy;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Created by jh.choi on 2020-07-23.
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] stringArgs = {"flower","flow","flight"};
		longestCommonPrefix(stringArgs);

	}
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length ==0) {
			return "";
		}
		StringBuilder prefix = new StringBuilder(strs[0]);
		for( int i = 1; i < strs.length; i++) {
			int min = Math.min(prefix.length(), strs[i].length());
			int j;
			for (j = 0; j < min; j++) {
				if(prefix.charAt(j) != strs[i].charAt(j)){
					break;
				}
			}
			prefix.delete(j, prefix.length());
		}

		return prefix.toString();
	}
}
