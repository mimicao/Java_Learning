package cn.laoliu_05;

public class IntegerTest {
	public static void main(String[] args) {
		Integer i = 1;
		i += 1;
		System.out.println("i:" + i);

		Integer ii = new Integer(1);
		ii = Integer.valueOf(ii.intValue() + 1);
		System.out.println("ii:" + ii);
	}
}