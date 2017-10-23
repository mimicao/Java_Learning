/*
继承的注意事项
*/

class Father {
	private int num = 10;
	public int num1 = 20;
	
	private void method() {
		System.out.println(num);
		System.out.println(num1);
	}
	
	public void show() {
		System.out.println(num);
		System.out.println(num1);
	}
	
}

class Son extends Father {
	public void Function() {
		//子类不能继承父类私有的变量
		//System.out.println(num);
		System.out.println(num1);
	}
}

class InheritDemo2 {
	public static void main(String[] args) {
		Son son = new Son();
		
		//子类不能继承父类私有的方法
		//Son.method();
		son.show();
	}
}