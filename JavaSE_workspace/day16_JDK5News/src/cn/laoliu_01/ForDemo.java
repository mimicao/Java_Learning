package cn.laoliu_01;

import java.util.ArrayList;

/*
 * for(Ԫ���������� ���� : �������Collection����) {
 * 	ʹ�ñ������ɣ��ñ�������Ԫ��
 *     }
 */
public class ForDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i : arr) {
			System.out.println(i);
		}

		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");

		for (String s : list) {
			System.out.println(s);
		}
	}
}