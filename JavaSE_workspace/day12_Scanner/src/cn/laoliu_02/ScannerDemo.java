package cn.laoliu_02;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//获取两个int
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("a:"+a+"\tb:"+b);
//
//		//获取两个String		
//		System.out.println("-------------------------");
//		
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		System.out.println(str1+'\n'+str2);
		
//		//获取一个String，再获取一个int
//		System.out.println("-------------------------");
//		String str2 = sc.nextLine();
//		int c = sc.nextInt();
//		
//		System.out.println("str2:"+str2+'\t'+"c:"+c);
		
//		//先输入一个int, 再输入一个String
//		/* 10
//		 * d:10	str3:
//		 * 先获取int再获取String会出现问题
//		 * */
//		System.out.println("-------------------------");
//		int d = sc.nextInt();
//		String str3 = sc.nextLine();
//		
//		System.out.println("d:"+d+'\t'+"str3:"+str3);
		
		//获取一个String，再获取一个int
		//将所有输入为字符串，再进行转型
		System.out.println("-------------------------");
		int e = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		String str4 = sc1.nextLine();

		System.out.println("str2:"+str4+'\t'+"e:"+e);	
		
		
	}
}
