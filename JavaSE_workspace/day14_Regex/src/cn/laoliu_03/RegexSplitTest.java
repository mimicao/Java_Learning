package cn.laoliu_03;

import java.util.Arrays;

public class RegexSplitTest {
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		String[] sp = s.split(" ");
		int[] num = new int[sp.length];

		for (int i = 0; i < sp.length; i++) {
			num[i] = Integer.parseInt(sp[i]);
		}

		Arrays.sort(num);

		StringBuilder s1 = new StringBuilder();
		for (int i = 0; i < num.length; i++) {
			s1.append(num[i]).append(" ");
		}

		String result = s1.toString().trim();
		
		System.out.println("source:" + s);
		System.out.println("result:" + result);
	}
}
