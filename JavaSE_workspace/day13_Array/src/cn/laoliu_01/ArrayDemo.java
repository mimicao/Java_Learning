package cn.laoliu_01;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 25, 23, 48, 89, 2, 13, 57, 48, 56 };

		printArray(arr);
		rankArray(arr);
		printArray(arr);
	}

	public static void rankArray(int[] arr) {
		int count = 0;
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				count++;
			}
		}
		System.out.println("count:"+count+"��");
	}

	public static void printArray(int[] arr) {
		System.out.print('[');

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ",");
			}
		}

		System.out.println(']');
	}
}
