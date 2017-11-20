package cn.laoliu_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		while (0 != (i = sc.nextInt())) {
			list.add(i);
		}
		
		Object[] ii = list.toArray();
		Integer[] iii = (Integer[])ii;
		
		Integer[] result = new Integer[list.size()];
		list.toArray(result);
		
		Arrays.sort(result);
		
		System.out.println(result[result.length-1]);

	}
}
