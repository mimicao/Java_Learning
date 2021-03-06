package cn.laoliu_02;

//boolean equals(Object obj)
//boolean equalsIgnoreCase(String str)
//boolean contains(String str)
//boolean startsWith(String str)
//boolean endsWith(String str)
//boolean isEmpty()

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorlD";

		// boolean equals(Object obj)
		System.out.println("equals:" + s1.equals(s2));
		System.out.println("equals:" + s1.equals(s3));
		System.out.println("---------------------------");

		// boolean equalsIgnoreCase(String str)
		System.out.println("equalsIgnoreCase:" + s1.equalsIgnoreCase(s2));
		System.out.println("equalsIgnoreCase:" + s1.equalsIgnoreCase(s3));
		System.out.println("---------------------------");

		// boolean contains(String str)
		System.out.println("contains:" + s1.contains("ow"));
		System.out.println("contains:" + s3.contains("ow"));
		System.out.println("---------------------------");

		// boolean startsWith(String str)
		System.out.println("startsWith:" + s1.startsWith("he"));
		System.out.println("startsWith:" + s1.startsWith("He"));
		System.out.println("---------------------------");

		// boolean endsWith(String str)
		System.out.println("endsWith:" + s1.endsWith("rd"));
		System.out.println("endsWith:" + s1.endsWith("rD"));
		System.out.println("---------------------------");
		
		//boolean isEmpty()
		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty:"+s4.isEmpty());
		//NullPointerException
		//s5对象不存在，多亿不能调用方法，空指针异常
		//System.out.println("isEmpty:"+s5.isEmpty());
		System.out.println(s4.equals(s5));
		System.out.println(s4);//""
		System.out.println(s5);//null
	}
}
