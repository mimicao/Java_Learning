package cn.laoliu_01;

import java.util.Calendar;

/*
 * Calendar�����:
 * 		Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR ��
 * 		 �����ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
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