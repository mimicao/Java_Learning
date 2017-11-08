package cn.laoliu_02;

import java.util.Scanner;

/*
 * 筛选电话号码：
 * 	13*********
 * 	18*********
 */

public class RegexDemo {
	public static void main(String[] args) {
		Scanner phone = new Scanner(System.in);
		System.out.println("请输入电话号码：");

		String s = phone.nextLine();

		System.out.println("result：" + s.matches("1[38]\\d{9}"));
	}
}
