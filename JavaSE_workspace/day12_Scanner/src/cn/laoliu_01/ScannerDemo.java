package cn.laoliu_01;

import java.util.Scanner;

//public static final InputStream in

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextInt()) {
			int i = sc.nextInt();
			System.out.println(i);
		} else {
			System.out.println("�����������");
		}

	}
}
