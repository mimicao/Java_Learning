class Father {
	public int num = 10;
	/*
	public Father() {
		System.out.println("Father���޲ι��췽��");
	}*/
	
	public Father(String name) {
		System.out.println("Father���вι��췽��");
	}
}

class Son extends Father {
	//public int num2 = 20;
	public int num = 20;
	
	public Son() {
		//super(); Ĭ���Ǹ�super() ���ʸ�����޲ι��췽��
		super("hello");//���ʸ�����вι��췽��
		System.out.println("Son���޲ι��췽��");
	}
	
	public Son(String name) {
		//super("hello");
		this();
		
		System.out.println("Son���вι��췽��");
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