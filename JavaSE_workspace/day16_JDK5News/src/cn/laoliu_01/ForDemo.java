package cn.laoliu_01;

import java.util.ArrayList;

/*
 * for(元素数据类型 变量 : 数组或者Collection集合) {
 * 	使用变量即可，该变量就是元素
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
