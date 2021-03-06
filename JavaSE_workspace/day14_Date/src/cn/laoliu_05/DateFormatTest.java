package cn.laoliu_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * A.键盘录入出生年月日
 * B.把该字符串转换为一个日期
 * C.通过日期的到毫秒
 * D.获取当前的毫秒住
 * E.用D-C的得到一个毫秒值
 * F.把E的值转换为年
 */
public class DateFormatTest {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生年月日：");
		String line = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);
		
		long time = d.getTime();
		
		long curTime = System.currentTimeMillis();
		
		long divTime = curTime - time;
		
		long day = divTime / 1000 / 60 / 60 / 24;
		long year = day / 365;
		System.out.println("你来到世界"+day+"天");
		System.out.println("你来到世界"+year+"年");
	}
}
