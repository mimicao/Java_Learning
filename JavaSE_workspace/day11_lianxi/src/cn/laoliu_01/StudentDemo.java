package cn.laoliu_01;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setName("Caomei");
		s1.setAge(10);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		
		Student s2 = new Student("Heimei", 20);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();
	}
}
