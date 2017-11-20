package cn.laoliu_03;

public class ArgsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println(result);

		int c = 30;
		result = sum(a, b, c);
		System.out.println(result);

		int d = 40;
		result = sum(a, b, c, d);
		System.out.println(result);
	}

	public static int sum(int b, int... a) {
		// System.out.println(a);
		// return 0;
		int s = 0;
		
		for(int i:a){
			s+=i;
		}
		
		return s;
	}

	// public static int sum(int a, int b) {
	// return a + b;
	// }
	//
	// public static int sum(int a, int b, int c) {
	// return a + b + c;
	// }
	//
	// public static int sum(int a, int b, int c, int d) {
	// return a + b + c + d;
	// }
}
