/*
�̳е�ע������
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
		//���಻�ܼ̳и���˽�еı���
		//System.out.println(num);
		System.out.println(num1);
	}
}

class InheritDemo2 {
	public static void main(String[] args) {
		Son son = new Son();
		
		//���಻�ܼ̳и���˽�еķ���
		//Son.method();
		son.show();
	}
}