package cn.laoliu_02;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		StringBuffer sb1 = sb.append("hello");

// 		sb.append(true);
// 		sb.append(12);
// 		sb.append(12.56f);

		sb.append(true).append(12).append(12.56f);
		System.out.println("sb:" + sb);
		System.out.println("sb1:" + sb1);
		System.out.println(sb == sb1);
	}
}
