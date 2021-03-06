package cn.laoliu_03;

public class ArrayDemo {
	public static void main(String[] args) {
		String s = "dscagebf";
		
		char[] arr = s.toCharArray();

		printArray(arr);
		rankArray(arr);
		printArray(arr);
	}

	public static void rankArray(char[] arr) {
		int count = 0;
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[j] > arr[i]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				count++;
			}
		}
		System.out.println("count:" + count + "��");
	}

	public static void printArray(char[] arr) {
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
