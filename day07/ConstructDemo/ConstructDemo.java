class Student {
	private String name;
	private int age;
	
	static String option;
	
	public Student() {
		System.out.println("这是无参构造");
	}
		
	public Student(String name) {
		System.out.println("这是一个带String类型参数的构造方法");
		this.name = name;
	}

	public Student(int age) {
		System.out.println("这是一个带int类型参数的构造方法");
		this.age = age;
	}
	
	public Student(int age, String name) {
		System.out.println("这是一个带多个类型参数的构造方法");
		this.age = age;
		this.name = name;
	}
	
	public void show() {
		System.out.println("姓名："+name+"--------"+"年龄："+age+option);
	}
}

class ConstructDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.option = "农村";
		s.show();
		
		System.out.println("---------------------------");
		Student s1 = new Student(10);
		s1.show();
		
		System.out.println("---------------------------");
		Student s2 = new Student("草莓");
		s2.show();
		s2.option = "城市";
		
		System.out.println("---------------------------");
		Student s3 = new Student(40, "蓝莓");
		s3.show();
	}
}