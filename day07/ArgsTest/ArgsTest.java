/*
��ʽ�����ǻ�������
*/
class ArgsDemo{
	public int sum(int a, int b){
		return a+b;
	}
}

/*
��ʽ��������������
*/
class Student{
	public void show(){
		System.out.println("�Ұ�ѧϰ");
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