package cn.laoliu_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List�������ص�
 * 		ArrayList:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 		Vector:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̰߳�ȫ��Ч�ʵ� 
 * 		LinkedList
 * 			�ײ����ݽṹ����������ѯ������ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add("java");

		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("-----------------");
		
		for (int i = 0; i < array.size(); i++) {
			String s = (String) array.get(i);
			System.out.println(s);
		}

	}
}