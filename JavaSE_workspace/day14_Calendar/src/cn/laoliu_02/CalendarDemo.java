package cn.laoliu_02;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"��"+(month+1)+"��"+day+"��");
		
		c.add(Calendar.YEAR, 10);
		c.add(Calendar.DAY_OF_MONTH, -5);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_MONTH);	
		System.out.println(year+"��"+(month+1)+"��"+day+"��");
		
		c.set(2000, 11, 15);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_MONTH);	
		System.out.println(year+"��"+(month+1)+"��"+day+"��");
	}
}