package cn.laoliu_04;

public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		//Student s2 = new Student();

		Object obj = s1.clone();
		Student s2 = (Student)obj;
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
