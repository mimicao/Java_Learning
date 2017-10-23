/*
形式参数是基本类型
*/
class ArgsDemo{
	public int sum(int a, int b){
		return a+b;
	}
}

/*
形式参数是引用类型
*/
class Student{
	public void show(){
		System.out.println("我爱学习");
	}
}

class StudentDemo{
	public void method(Student s){
		s.show();
	}
}

class ArgsTest{
	public static void main(String[] args){
		ArgsDemo d = new ArgsDemo();
		int result = d.sum(10,20);
		System.out.println(result);
		
		System.out.println("--------------------------");
		
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		
		sd.method(s);
	}
}