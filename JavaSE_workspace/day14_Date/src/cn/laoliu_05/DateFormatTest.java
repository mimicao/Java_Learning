package cn.laoliu_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * A.����¼�����������
 * B.�Ѹ��ַ���ת��Ϊһ������
 * C.ͨ�����ڵĵ�����
 * D.��ȡ��ǰ�ĺ���ס
 * E.��D-C�ĵõ�һ������ֵ
 * F.��E��ֵת��Ϊ��
 */
public class DateFormatTest {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ��������գ�");
		String line = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);
		
		long time = d.getTime();
		
		long curTime = System.currentTimeMillis();
		
		long divTime = curTime - time;
		
		long day = divTime / 1000 / 60 / 60 / 24;
		long year = day / 365;
		System.out.println("����������"+day+"��");
		System.out.println("����������"+year+"��");
	}
}