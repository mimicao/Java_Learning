package cn.laoliu_01;

import java.util.Scanner;

/*
 * ��֤QQ����
 * 	������5-15λ����
 * 	������0��ͷ
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("������QQ���룺");
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