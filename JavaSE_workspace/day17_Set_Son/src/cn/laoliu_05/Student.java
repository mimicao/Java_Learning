package cn.laoliu_05;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		return 0;
//		return 1;
//		return -1;
		int num = this.age - o.age;
		int num2 = num==0?this.name.compareTo(o.name):num;
		return num2;
		
	}

}
