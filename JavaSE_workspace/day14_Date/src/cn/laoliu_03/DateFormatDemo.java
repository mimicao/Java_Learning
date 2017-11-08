package cn.laoliu_03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat(); // 默认模式
		String s = sd.format(d);
		System.out.println(s);
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy年MM月dd日, HH:mm:ss");
		String s1 = sd1.format(d);
		System.out.println(s1);
	}
}
