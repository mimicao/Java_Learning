package cn.laoliu_05;

public class StringTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, };
		String s1 = arrayToString(arr);
		System.out.println(s1);
	}

	public static String arrayToString(int[] arr) {
		String s1 = "";
		s1 += "[";

		for (int i = 0; i < arr.length; i++) {
			s1 += arr[i];
			if (i == arr.length - 1) {
				s1 += ']';
			} else {
				s1 += ',';
			}
		}

		return s1;
	}
}
