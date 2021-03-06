package cn.laoliu_05;

/*
 * 替换功能
 * String replace(char old,char new)
 * String replace(String old,String new)
 * 去除字符串两空格	
 * String trim()
 * 按字典顺序比较两个字符串  
 * int compareTo(String str)
 * int compareToIgnoreCase(String str) 
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		String s3 = s1.replaceAll("wo", "sasdasfs");

		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);

		System.out.println("-------------------");
		String s4 = " Hello World ";
		String s5 = s4.trim();

		System.out.println("s4:" + s4);
		System.out.println("s5:" + s5);

		System.out.println("-------------------");
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		String s10 = "hell";

		System.out.println(s6.compareTo(s7));
		System.out.println(s6.compareTo(s8));
		System.out.println(s6.compareTo(s9));
		System.out.println(s6.compareTo(s10));//返回的是长度差

	}
}
