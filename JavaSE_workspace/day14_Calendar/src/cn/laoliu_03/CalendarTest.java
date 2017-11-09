package cn.laoliu_03;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入年份：");
		int myYear = sc.nextInt();
		Calendar c = Calendar.getInstance();
		
		c.set(myYear, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		System.out.println(myYear+"年的二月有"+c.get(Calendar.DAY_OF_MONTH)+"天");
	}
}
