package cn.laoliu_01;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add("java");
		// array.add(new Integer(100));
		// array.add(10);// JDK 5֮����Զ�װ��
		// �ȼ���array.add(Integer.valueOf(10));

		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
