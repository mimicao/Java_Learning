package cn.laoliu_05;

//public StringBuffer reverse()

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		sb.append("hello").append("world").append("java");

		System.out.println("sb:" + sb);

		sb.reverse();

		System.out.println("sb:" + sb);
	}
}
