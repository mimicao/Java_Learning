package cn.laoliu_04;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "javaSE";

		System.out.println(s1.substring(0, 1).toUpperCase()
				.concat(s1.substring(1).toLowerCase()));
	}
}
