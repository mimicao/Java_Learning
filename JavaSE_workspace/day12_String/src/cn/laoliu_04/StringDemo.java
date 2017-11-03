package cn.laoliu_04;

/*
 * String类的转换功能
 * byte[] getBytes()
 * char[] toCharArray()
 * static String valueOf(char[] chs)
 * static String valueOf(int i)
 * String toLowerCase()
 * String toUpperCase()
 * String concat(String str)
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "HelloWorld";

		byte[] b = s1.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		System.out.println("-----------------------");
		char[] c = s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		System.out.println("-----------------------");
		String s2 = String.valueOf(c);
		System.out.println(s2);

		System.out.println("-----------------------");
		int n = 100;
		String s3 = String.valueOf(n);
		System.out.println(s3);

		System.out.println("-----------------------");
		System.out.println("toLowerCase:" + s1.toLowerCase());
		System.out.println("s1:" + s1);

		System.out.println("-----------------------");
		System.out.println("toUpperCase:" + s1.toUpperCase());
		System.out.println("s1:" + s1);

		System.out.println("-----------------------");
		String s4 = "Java";
		String s5 = "SE";
		String s6 = s4 + s5;
		String s7 = s4.concat(s5);
		System.out.println("s6:" + s6);
		System.out.println("s7:" + s7);
	}
}
