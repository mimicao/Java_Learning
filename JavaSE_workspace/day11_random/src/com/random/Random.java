package com.random;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("请输入数字1-100: ");
		i = sc.nextInt();

		while (true) {
			if (i == num) {
				break;
			} else if (i < num) {
				System.out.println("答小了");
			} else {
				System.out.println("答大了");
			}

			System.out.print("答错了请重新输入：");
			i = sc.nextInt();

		}

		System.out.println("恭喜通关！！！！");
	}
}
