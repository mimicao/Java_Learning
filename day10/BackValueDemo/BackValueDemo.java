class Student {
	public int i;
	
	public void show() {
		System.out.println("show");
	}
}

class StudentDemo {
	public Student method() {
		Student s = new Student();
		System.out.println(s);
		s.i = 200;
		
		return s;
	}
}

class BackValueDemo {
	public static void main(String[] args) {
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		
		System.out.println(s.i);
		System.out.println(s);
		s = sd.method();
		System.out.println(s.i);
		System.out.println(s);
		s.show();
	}
}