package cn.laoliu_04;

/*
 * 论坛中不能出现数字字符，用*替换
 * public String replaceAll(String regex,String replacement)
 */
public class RegexReplaceDemo {
	public static void main(String[] args) {
		String s = "hello123456world";
		String regex = "\\d";

		String s1 = s.replaceAll(regex, "*");

		System.out.println(s);
		System.out.println(s1);
	}
}
