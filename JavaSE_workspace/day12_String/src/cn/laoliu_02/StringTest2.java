package cn.laoliu_02;

import java.util.Scanner;

/*
 * ģ���¼�����ϴλ��ᣬ����ʾ���м��λ���
 * ��¼�ɹ����в�������Ϸ
 */
public class StringTest2 {
	public static void main(String[] args) {
		String name = "mimicao";
		String key = "random";
		Scanner sc = new Scanner(System.in);

		for (int i = 2; i >= 0; i--) {
			System.out.print("�������û�����");
			String in_name = sc.nextLine();
			if (in_name.equals(name)) {
				System.out.print("���������룺");
				String in_key = sc.nextLine();
				if (in_key.equals(key)) {
					System.out.println("��¼�ɹ�");
					GuessNumberGame.start();
					break;
				} else {
					System.out.println("�����������");
				}

			} else {
				System.out.println("�û����������");
			}

			if (i == 0) {
				System.out.println("�����˺��ѱ��������������Ա��ϵ������");
			} else {
				System.out.println("ʣ�����������" + i);
				System.out.println("----------------------");
			}

		}
	}
}
