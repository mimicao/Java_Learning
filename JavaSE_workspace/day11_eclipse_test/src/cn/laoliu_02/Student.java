package cn.laoliu_02;

public class Student {
	private String name;
	private int age;

	public int num =10;
	public final int num5= 20;
	public static int num3 =30;
	public static final int num4= 40;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}

class Teachers {
	private String name;
	private int age;
	
	
	public Teachers() {
		super();
	}
	
	public Teachers(String name, int age) {
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
}

class StudentDemo {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
	}

	public StudentDemo() {
		super();
	}
	
}