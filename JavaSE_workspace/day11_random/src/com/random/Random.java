package com.random;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("����������1-100: ");
		i = sc.nextInt();

		while (true) {
			if (i == num) {
				break;
			} else if (i < num) {
				System.out.println("��С��");
			} else {
				System.out.println("�����");
			}

			System.out.print("��������������룺");
			i = sc.nextInt();

		}

		System.out.println("��ϲͨ�أ�������");
	}
}