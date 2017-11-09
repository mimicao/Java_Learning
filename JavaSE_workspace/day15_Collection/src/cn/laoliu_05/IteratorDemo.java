package cn.laoliu_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator(): �����������ϵ�ר�ñ�����ʽ
 * 		Object next(): ��ȡԪ�ز��ƶ�����һ��λ��
 * 			NoSuchElementException: û��������Ԫ�أ��Ѿ��ҵ������
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("hello");
		c.add("world");
		c.add("Java");

		Iterator it = c.iterator();

		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());

		// ���һ����Ӧ��д����ÿ�λ�ȡǰ����Ҫ�ж�
		while (it.hasNext()) {
			// System.out.println(it.next());
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}