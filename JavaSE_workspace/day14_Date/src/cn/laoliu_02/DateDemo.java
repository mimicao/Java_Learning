package cn.laoliu_02;

import java.util.Date;

/*
 * public long getTime()
 * public void setTime(long time)
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();

		long time = d.getTime();
		System.out.println(time);
//		System.out.println(System.currentTimeMillis());
		
		System.out.println("d:" + d);
		d.setTime(1000);
		System.out.println("d:" + d);
	}
}
