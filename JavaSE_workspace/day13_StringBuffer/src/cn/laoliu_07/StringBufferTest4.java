package cn.laoliu_07;

import java.util.Scanner;

public class StringBufferTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string:");
		String s = sc.nextLine();
				
		System.out.println(strIsEqual(s));
	}
	
	public static boolean strIsEqual(String s1){
		 return new StringBuffer(s1).reverse().toString().equals(s1);
	}
}
