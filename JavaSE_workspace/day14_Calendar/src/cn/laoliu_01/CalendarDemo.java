package cn.laoliu_01;

import java.util.Calendar;

/*
 * Calendar类概述:
 * 		Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等
 * 		 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 *
 * public static Calendar getInstance()
 * public int get(int field)
 * public void add(int field,int amount)
 * public final void set(int year,int month,int date)
 */
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cd = Calendar.getInstance();
		
		int year = cd.get(Calendar.YEAR);
		int month = cd.get(Calendar.MONTH);
		int day = cd.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"-"+(month+1)+"-"+day);
	}
}
