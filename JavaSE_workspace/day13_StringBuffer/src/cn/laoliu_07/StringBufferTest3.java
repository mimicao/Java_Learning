package cn.laoliu_07;

import java.util.Scanner;

public class StringBufferTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter data:");
		String s = sc.nextLine();

		// ��ʽ1��ʹ��String����ת
		String s1 = myReverse(s);
		System.out.println("s1:" + s1);

		// ��ʽ2��ʹ��StringBuffer��reserve����
		String s2 = myReverse2(s);
		System.out.println("s2:" + s2);
	}

	public static String myReverse(String s) {
		String result = "";
		char[] chs = s.toCharArray();

		for (int i = s.length() - 1; i >= 0; i--) {
			result += chs[i];
		}

		return result;
	}

	public static String myReverse2(String s) {
		return new StringBuffer(s).reverse().toString();
	}
}