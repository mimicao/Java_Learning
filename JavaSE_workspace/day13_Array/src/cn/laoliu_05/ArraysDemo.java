package cn.laoliu_05;

import java.util.Arrays;

/*
 * Arrays: 操作数组（比如排序和搜索）的各种方法
 * public static String toString(int[] a)
 * public static void sort(int[] a)
 * public static int binarySearch(int[] a,int key)//二分查找法
 */
public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = { 25, 23, 48, 89, 2, 13, 57, 48, 56 };

		System.out.println("排序前：" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));

		// [2, 13, 23, 25, 48, 48, 56, 57, 89]
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 577));
	}
}
