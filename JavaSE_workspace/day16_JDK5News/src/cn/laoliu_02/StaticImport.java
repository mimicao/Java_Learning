package cn.laoliu_02;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;

//import static java.util.ArrayList.add;

public class StaticImport {
	public static void main(String[] args) {
		// System.out.println(Math.abs(-10));
		// System.out.println(Math.pow(2, 3));
		// System.out.println(Math.max(10, 20));

		System.out.println(java.lang.Math.abs(-10));
		System.out.println(pow(2, 3));
		System.out.println(max(10, 20));
	}

	public static void abs(String s) {
		System.out.println(s);
	}
}
