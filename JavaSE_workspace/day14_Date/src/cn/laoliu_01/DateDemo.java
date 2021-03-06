package cn.laoliu_01;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("d1:" + d1);

		Date d2 = new Date(System.currentTimeMillis());
		System.out.println("d2:" + d2);

		long time = 1000 * 60 * 60;
		Date d3 = new Date(time);
		System.out.println("d3:" + d3); //自动获取时区
	}
}
