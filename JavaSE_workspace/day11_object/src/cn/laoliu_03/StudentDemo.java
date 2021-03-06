package cn.laoliu_03;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		Student s3 = s1;
		System.out.println(s3==s1);
		
		System.out.println("-------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println("-------------");
		
		Demo d = new Demo();
		Object obj = (Object)s1;
		boolean res = obj instanceof Demo;
		System.out.println(res);
	}
}

class Demo {}
