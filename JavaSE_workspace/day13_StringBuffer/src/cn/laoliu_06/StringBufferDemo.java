package cn.laoliu_06;

//public String substring(int start)
//public String substring(int start,int end)

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		sb.append("hello").append("world").append("java");

		String s = sb.substring(5);
		System.out.println("s:" + s);
		System.out.println("sb:" + sb);

		String s1 = sb.substring(5, 10);
		System.out.println("s1:" + s1);
		System.out.println("sb:" + sb);
	}
}
