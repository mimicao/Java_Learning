class Father {
	public int num = 10;
	/*
	public Father() {
		System.out.println("Father的无参构造方法");
	}*/
	
	public Father(String name) {
		System.out.println("Father的有参构造方法");
	}
}

class Son extends Father {
	//public int num2 = 20;
	public int num = 20;
	
	public Son() {
		//super(); 默认是给super() 访问父类的无参构造方法
		super("hello");//访问父类的有参构造方法
		System.out.println("Son的无参构造方法");
	}
	
	public Son(String name) {
		//super("hello");
		this();
		
		System.out.println("Son的有参构造方法");
	}
	public void show() {
		int num = 30;
		
		//System.out.println(num2);
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

class InheritDemo3 {
	public static void main(String[] args) {
		//Son son = new Son();
		Son son = new Son("hello");
		
		son.show();
	}
}