package cn.laoliu_02;

import java.util.Scanner;

/*
 * 模拟登录，给上次机会，并提示还有几次机会
 * 登录成功进行猜数字游戏
 */
public class StringTest2 {
	public static void main(String[] args) {
		String name = "mimicao";
		String key = "random";
		Scanner sc = new Scanner(System.in);

		for (int i = 2; i >= 0; i--) {
			System.out.print("请输入用户名：");
			String in_name = sc.nextLine();
			if (in_name.equals(name)) {
				System.out.print("请输入密码：");
				String in_key = sc.nextLine();
				if (in_key.equals(key)) {
					System.out.println("登录成功");
					GuessNumberGame.start();
					break;
				} else {
					System.out.println("密码输入错误！");
				}

			} else {
				System.out.println("用户名输入错误！");
			}

			if (i == 0) {
				System.out.println("您的账号已被锁定，请与管理员联系解锁！");
			} else {
				System.out.println("剩余输入次数：" + i);
				System.out.println("----------------------");
			}

		}
	}
}
