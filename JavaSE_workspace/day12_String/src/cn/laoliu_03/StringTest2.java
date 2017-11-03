package cn.laoliu_03;

import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		//String s1 = "Hello123World";
		Scanner sc = new Scanner(System.in);
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;
		char ch;
		
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		String s1 = sc.nextLine();
		
		for (int i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i);
			if (ch >= '0' && ch <= '9') {
				numCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			}
		}
		
		System.out.println("bigCount:" + bigCount);
		System.out.println("smallCount:" + smallCount);
		System.out.println("numCount:" + numCount);
	}
}
