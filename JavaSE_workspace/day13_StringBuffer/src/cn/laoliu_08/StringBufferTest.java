package cn.laoliu_08;

public class StringBufferTest {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);
		change(s1, s2);
		System.out.println(s1 + "---" + s2);

		StringBuffer s3 = new StringBuffer("hello");
		StringBuffer s4 = new StringBuffer("world");
		System.out.println(s3 + "---" + s4);
		change(s3, s4);
		System.out.println(s3 + "---" + s4);

	}

	public static void change(StringBuffer s3, StringBuffer s4) {
		s3 = s4;
		s3 = s3.append(s4);
	}

	public static void change(String s1, String s2) {
		s1 = s2;
		s1 = s1 + s2;
	}
}
