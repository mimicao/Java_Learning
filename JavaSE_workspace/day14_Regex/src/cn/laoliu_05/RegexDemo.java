package cn.laoliu_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher("hello1234567world");
		boolean flag = m.matches();
		System.out.println(m.replaceAll(""));
		System.out.println("flag:"+flag);
		
	}
}
