package cn.laoliu_04;

import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();

		String s = DateUtil.dateToString(d, "yyyy��MM��dd��");
		System.out.println(s);

		String s1 = "2015-12-25";
		Date d1 = DateUtil.stringToDate(s1, "yyyy-MM-dd");
		System.out.println(d1);
	}
}
