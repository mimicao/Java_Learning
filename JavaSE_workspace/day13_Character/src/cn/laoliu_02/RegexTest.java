package cn.laoliu_02;

import java.util.Scanner;

/*
 * У������
 * 		A.��������
 * 		B.�����������
 * 			50137732@qq.com
 * 			*@����.com
 * 		C.���ù���
 * 		D.������
 */
public class RegexTest {
	public static void main(String[] args) {
		Scanner mailBox = new Scanner(System.in);
		System.out.println("�����������ַ��");
		String mailString = mailBox.nextLine();
		
		String regex = "\\w+@\\w{2,6}\\.\\{2,3}"; 
		System.out.println("result:" + mailString.matches(regex));
	}
}