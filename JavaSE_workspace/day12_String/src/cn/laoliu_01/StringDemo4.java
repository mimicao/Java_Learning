package cn.laoliu_01;

/*
 * 1.字符串如果是变量相加，先开空间，在拼接
 * 2.字符串如果是常量相加，先相加，然后在常量池找，如果有就直接返回，否则就创建
 */
public class StringDemo4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);// false
		System.out.println(s3.equals(s1 + s2));// true
		System.out.println(s3 == "hello" + "world");// true
		System.out.println(s3.equals("hello" + "world"));// true
		/*反编译结果如下
		 * System.out.println(s3 == (new StringBuilder(String.valueOf(s1))).append(s2).toString());
		 * System.out.println(s3.equals((new StringBuilder(String.valueOf(s1))).append(s2).toString()));
		 * System.out.println(s3 == "helloworld");
		 * System.out.println(s3.equals("helloworld"));
		 */

	}
}
