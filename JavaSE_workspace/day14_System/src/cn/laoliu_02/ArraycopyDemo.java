package cn.laoliu_02;

import java.util.Arrays;

public class ArraycopyDemo {
	public static void main(String[] args) {
		int[] arr = { 22, 33, 44, 55, 6, 77, 88 };
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };

		System.arraycopy(arr, 3, arr1, 1, arr.length - 3);

		System.out.println(Arrays.toString(arr) + '\n' + Arrays.toString(arr1));
	}
}
