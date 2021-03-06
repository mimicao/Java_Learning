package cn.laoliu_04;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 25, 23, 48, 89, 2, 13, 57, 48, 56 };

		int n = 1;
		printArray(arr);
		rankArray(arr);
		printArray(arr);
		int index = indexAtArray(n, arr);
		System.out.println(index);
	}

	//二分查找有序数组
	public static int indexAtArray(int num, int[] arr) {
		int max = arr.length - 1;
		int min = 0;
		int index = (max + min) / 2;

		while (true) {
			if (num < arr[index]) {
				max = index - 1;
			} else if (num > arr[index]) {
				min = index + 1;
			} else if (arr[index] == num) {
				break;
			}

			if (max < min) {
				index = -1;
				break;
			} else {
				index = (max + min) / 2;
			}

		}

		return index;
	}

	public static void rankArray(int[] arr) {
		int count = 0;
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				count++;
			}
		}
		System.out.println("count:" + count + "次");
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
