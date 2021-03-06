package cn.laoliu_01;

import java.util.Scanner;

/*
 * 验证QQ号码
 * 	必须是5-15位数字
 * 	不能以0开头
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("请输入QQ号码：");
			String s = sc.nextLine();

			if (checkQQ(s)) {
				break;
			}
		}
	}

	public static boolean checkQQ(String s) {
		return s.matches("[1-9][0-9]{4,14}");
	}
}
