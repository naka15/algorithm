package leetcode.easy;

/**
 * Created by jh.choi on 2020-07-22.
 */
public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCDXCIV"));
	}

	/**
	 * I : 1
	 * V : 5
	 * X : 10
	 * L : 50
	 * C : 100
	 * D : 500
	 * M : 1000
	 * IV, IX : 4, 9
	 * XL, XC : 40, 90
	 * CD, CM : 400, 900
	 */
	public static int romanToInt(String s) {
		int result = 0;
		int temp = 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			switch(c) {
				case 'I':
						if (temp == 'V' || temp == 'X') {
							result += -1;
						}else {
							result += 1;
						}
						break;
				case 'V' : result += 5;
						break;
				case 'X' :
						if (temp == 'L' || temp == 'C') {
							result += -10;
						}else {
							result += 10;
						}
						break;
				case 'L' : result += 50;
						break;
				case 'C' :
						if (temp == 'D' || temp == 'M') {
							result += -100;
						}else {
							result += 100;
						}
						break;
				case 'D' : result += 500;
						break;
				case 'M' : result += 1000;
						break;
			}
			temp = c;
		}
		return result;
	}


}
