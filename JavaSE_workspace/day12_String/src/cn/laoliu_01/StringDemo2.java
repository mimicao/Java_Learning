package cn.laoliu_01;

public class StringDemo2 {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println(s);

		String s1 = new String("hello");
		s1 += "world";
		System.out.println(s1);

		System.out.println("s equals s1:" + s.equals(s1));
		System.out.println("s == s1:" + (s == s1));
	}
}