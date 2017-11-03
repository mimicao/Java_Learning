package cn.laoliu_05;

import java.util.Arrays;

/*
 * Arrays: �������飨����������������ĸ��ַ���
 * public static String toString(int[] a)
 * public static void sort(int[] a)
 * public static int binarySearch(int[] a,int key)//���ֲ��ҷ�
 */
public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = { 25, 23, 48, 89, 2, 13, 57, 48, 56 };

		System.out.println("����ǰ��" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("�����" + Arrays.toString(arr));

		// [2, 13, 23, 25, 48, 48, 56, 57, 89]
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 577));
	}
}