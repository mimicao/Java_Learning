package cn.laoliu_03;

/*
 * String类的获取功能
 * int length()
 * char charAt(int index)
 * int indexOf(int ch)
 * int indexOf(String str)
 * int indexOf(int ch,int fromIndex)
 * int indexOf(String str,int fromIndex)
 * String substring(int start)
 * String substring(int start,int end)
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
	
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.indexOf("ow"));
		System.out.println(s1.indexOf('l', 4));
		System.out.println(s1.indexOf("ld", 4));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4, 9));//包左不包右，索引到end-1
	}
}
