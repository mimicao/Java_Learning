package cn.laoliu_02;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//��ȡ����int
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("a:"+a+"\tb:"+b);
//
//		//��ȡ����String		
//		System.out.println("-------------------------");
//		
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		System.out.println(str1+'\n'+str2);
		
//		//��ȡһ��String���ٻ�ȡһ��int
//		System.out.println("-------------------------");
//		String str2 = sc.nextLine();
//		int c = sc.nextInt();
//		
//		System.out.println("str2:"+str2+'\t'+"c:"+c);
		
//		//������һ��int, ������һ��String
//		/* 10
//		 * d:10	str3:
//		 * �Ȼ�ȡint�ٻ�ȡString���������
//		 * */
//		System.out.println("-------------------------");
//		int d = sc.nextInt();
//		String str3 = sc.nextLine();
//		
//		System.out.println("d:"+d+'\t'+"str3:"+str3);
		
		//��ȡһ��String���ٻ�ȡһ��int
		//����������Ϊ�ַ������ٽ���ת��
		System.out.println("-------------------------");
		int e = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		String str4 = sc1.nextLine();

		System.out.println("str2:"+str4+'\t'+"e:"+e);	
		
		
	}
}