/*
Java �м̳е��ص�

*/

/* ���ܶ�̳�
class Father {}

class Mother {}

class Son extends Father, Mother {}
*/

// ֧�ֶ��̳�

class GranfFather {
	public void show() {
		System.out.println("����үү");
	}
}

class Father extends GranfFather {
	public void show1() {
		System.out.println("���ǰְ�");
	}
}

class Son extends Father {
	public void show2() {
		System.out.println("���Ƕ���");
	}
}

class InheritDemo1 {
	public static void main(String[] args) {
		Son son = new Son();
		
		son.show();
		son.show1();
		son.show2();
	}
}