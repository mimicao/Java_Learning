class Student {
	private String name;
	private int age;
	
	static String option;
	
	public Student() {
		System.out.println("�����޲ι���");
	}
		
	public Student(String name) {
		System.out.println("����һ����String���Ͳ����Ĺ��췽��");
		this.name = name;
	}

	public Student(int age) {
		System.out.println("����һ����int���Ͳ����Ĺ��췽��");
		this.age = age;
	}
	
	public Student(int age, String name) {
		System.out.println("����һ����������Ͳ����Ĺ��췽��");
		this.age = age;
		this.name = name;
	}
	
	public void show() {
		System.out.println("������"+name+"--------"+"���䣺"+age+option);
	}
}

class ConstructDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.option = "ũ��";
		s.show();
		
		System.out.println("---------------------------");
		Student s1 = new Student(10);
		s1.show();
		
		System.out.println("---------------------------");
		Student s2 = new Student("��ݮ");
		s2.show();
		s2.option = "����";
		
		System.out.println("---------------------------");
		Student s3 = new Student(40, "��ݮ");
		s3.show();
	}
}