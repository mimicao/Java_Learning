package cn.laoliu_05;

import java.util.Scanner;

public class StringTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String result = "";
		char[] ch = s1.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			result += ch[i];
		}

		System.out.println(result);

	}
}