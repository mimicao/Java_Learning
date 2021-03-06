package cn.laoliu_01;

//public String()
//public String(byte[] bytes)
//public String(byte[] bytes,int offset,int length)
//public String(char[] value)
//public String(char[] value,int offset,int count)
//public String(String original)

public class StringDemo {
	public static void main(String[] args) {
		// public String()
		String str = new String();
		System.out.println("str:" + str);
		System.out.println(str.length());

		System.out.println("------------------");

		// public String(byte[] bytes)
		byte[] bys = { 97, 98, 99, 100, 101 };
		String str2 = new String(bys);
		System.out.println("str2:" + str2);
		System.out.println("str2.ength:" + str2.length());

		System.out.println("------------------");
		String str2_1 = new String(bys, 1, str2.length() - 1);
		System.out.println("str2_1:" + str2_1);
		System.out.println("str2_1.ength:" + str2_1.length());

		System.out.println("------------------");
		char[] chs = { 'a', 'b', 'c', 'd', '˵' };
		String str3 = new String(chs);
		System.out.println("str3:" + str3);
		System.out.println("str3.ength:" + str3.length());

		System.out.println("------------------");
		String str3_1 = new String(chs, 1, str3.length() - 1);
		System.out.println("str3_1:" + str3_1);
		System.out.println("str3_1.ength:" + str3_1.length());

		System.out.println("------------------");
		String str4 = "abcde";
		System.out.println(str4.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str4 == str2);
		System.out.println(str4.equals(str2));
	}
}
