package cn.laoliu_02;

import java.util.Scanner;

/*
 * ��֤QQ����
 * 	������5-15λ����
 * 	������0��ͷ
 */
public class CharacterTest {
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
		boolean flag = true;

		if (s.length() > 15 || s.length() < 5) {
			flag = false;
			System.out.println("����ĳ�������");
		} else {
			if (!s.startsWith("0")) {
				char[] chs = s.toCharArray();

				for (int i = 0; i < chs.length; i++) {
					if (Character.isDigit(chs[i])) {
						i++;
					} else {
						flag = false;
						System.out.println("����ĺ�������");
						break;
					}
				}
			} else {
				flag = false;
				System.out.println("������0��ͷ��");
			}

		}

		return flag;
	}
}