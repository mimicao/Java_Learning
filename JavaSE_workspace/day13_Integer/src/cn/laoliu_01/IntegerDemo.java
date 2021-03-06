package cn.laoliu_01;

/*
 * 计算100的二进制，八进制和十六进制
 */
public class IntegerDemo {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println("---------------------------");
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, 3));
		
		System.out.println("---------------------------");
		System.out.println(Integer.parseInt("111", 2));
	}
}
