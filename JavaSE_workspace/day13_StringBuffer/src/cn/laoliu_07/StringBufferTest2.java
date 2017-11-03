package cn.laoliu_07;

public class StringBufferTest2 {
	public static void main(String[] args) {
		int[] arr = { 88, 77, 55, 44, 33, 22, 11 };

		// ��ʽ1����String��ƴ��
		String s = arrayToString(arr);

		System.out.println("s:" + s);
		
		//��ʽ2����StringBuffer��ƴ��
		String sb = arrayToStringBuffer(arr);

		System.out.println("sb:" + sb);		
	}

	public static String arrayToString(int[] arr) {
		String s = "[";

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i];
			} else {
				s += arr[i];
				s += ',';
			}
		}

		s += "]";

		return s;
	}

	public static String arrayToStringBuffer(int[] arr) {
		StringBuffer sb = new StringBuffer();

		sb.append('[');
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
			} else {
				sb.append(arr[i]).append(',');
			}
		}
		sb.append(']');

		return sb.toString();
	}
}