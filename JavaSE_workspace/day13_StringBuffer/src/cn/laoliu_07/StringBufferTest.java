/*
 * String��StringBuffer���໥ת��
 * 
 */

package cn.laoliu_07;

public class StringBufferTest {
	public static void main(String[] args) {
		String s = "hello";

		// StringBuffer sb = "hello";

		// ͨ�����췽��
		StringBuffer sb = new StringBuffer(s);
		// ͨ��append
		StringBuffer sb1 = new StringBuffer();
		sb1.append(s);

		System.out.println("s:" + s);
		System.out.println("sb:" + sb);
		System.out.println("sb1:" + sb1);

		System.out.println("----------------------------");
		StringBuffer buffer = new StringBuffer("java");
		// ͨ�����췽��
		String s1 = new String(buffer);
		// ͨ��toString
		String s2 = buffer.toString();

		System.out.println("buffer:" + buffer);
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
	}
}