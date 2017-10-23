/*
匿名对象: 没有名字的对象

匿名对象的使用场景:
	1. 调用方法: 仅仅使用一次的时候。
		注意: 调用多次的时候，不适合。
	2. 好处: 匿名对象调用完毕就是垃圾。可以被垃圾回收器回收
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

class NoNameDemo{
	public static void main(String[] args){
		//常用对象调用
		Student s = new Student();
		s.show();
		s.show();//同一个对象是使用两次
		
		System.out.println("---------------------");
		//匿名对象的调用方法
		new Student().show();
		new Student().show();//这是两吃匿名对象
		
		System.out.println("---------------------");
		//匿名对象作实际参数
		new StudentDemo().method(new Student());
	}
}