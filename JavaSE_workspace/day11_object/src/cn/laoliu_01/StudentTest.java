package cn.laoliu_01;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());// 1097112149

		Student s1 = new Student();
		System.out.println(s1.hashCode());// 869295101

		Student s2 = s;
		System.out.println(s2.hashCode());// 1097112149

		System.out.println("-----------------");

		Student s3 = new Student();
		Class c = s3.getClass();
		String str = c.getName();
		System.out.println(str);

		System.out.println("-----------------");
		String str1 = s3.getClass().getName();
		System.out.println(str1);

	}
}
