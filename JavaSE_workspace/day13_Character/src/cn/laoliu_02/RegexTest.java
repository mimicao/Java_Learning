package cn.laoliu_02;

import java.util.Scanner;

/*
 * 校验邮箱
 * 		A.键入邮箱
 * 		B.电议邮箱规则
 * 			50137732@qq.com
 * 			*@域名.com
 * 		C.调用功能
 * 		D.输出结果
 */
public class RegexTest {
	public static void main(String[] args) {
		Scanner mailBox = new Scanner(System.in);
		System.out.println("请输入邮箱地址：");
		String mailString = mailBox.nextLine();
		
		String regex = "\\w+@\\w{2,6}\\.\\{2,3}"; 
		System.out.println("result:" + mailString.matches(regex));
	}
}
