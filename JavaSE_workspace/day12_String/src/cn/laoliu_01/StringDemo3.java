package cn.laoliu_01;

public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println("-----------------");
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		System.out.println("-----------------");
		String s5 = "hello";
		String s6 = new String("hello");
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
	}

}
