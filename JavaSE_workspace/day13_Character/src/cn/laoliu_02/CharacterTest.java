package cn.laoliu_02;

import java.util.Scanner;

/*
 * 验证QQ号码
 * 	必须是5-15位数字
 * 	不能以0开头
 */
public class CharacterTest {
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
		boolean flag = true;

		if (s.length() > 15 || s.length() < 5) {
			flag = false;
			System.out.println("输入的长度有误！");
		} else {
			if (!s.startsWith("0")) {
				char[] chs = s.toCharArray();

				for (int i = 0; i < chs.length; i++) {
					if (Character.isDigit(chs[i])) {
						i++;
					} else {
						flag = false;
						System.out.println("输入的号码有误！");
						break;
					}
				}
			} else {
				flag = false;
				System.out.println("不能以0开头！");
			}

		}

		return flag;
	}
}
