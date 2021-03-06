package cn.laoliu_03;

/*
 * int ------ String
 * String --- int
 */

public class IntegerDemo {
	public static void main(String[] args) {
		int num = 100;

		String s1 = "" + num;
		System.out.println("s1:" + s1);

		// ����
		String s2 = String.valueOf(num);
		System.out.println("s2:" + s2);

		String s3 = new Integer(num).toString();
		System.out.println("s3:" + s3);

		String s4 = Integer.toString(num);
		System.out.println("s4:" + s4);

		String s = "100";

		Integer ii = new Integer(s);
		int n1 = ii.intValue();
		System.out.println("n1:" + n1);

		// ����
		int n2 = Integer.parseInt(s);
		System.out.println("n2:" + n2);

		String ss = "12.39";
		float f1 = Float.parseFloat(ss);
		System.out.println("f1:" + f1);
	}
}
