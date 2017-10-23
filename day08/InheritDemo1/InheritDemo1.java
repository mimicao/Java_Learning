/*
Java 中继承的特点

*/

/* 不能多继承
class Father {}

class Mother {}

class Son extends Father, Mother {}
*/

// 支持多层继承

class GranfFather {
	public void show() {
		System.out.println("我是爷爷");
	}
}

class Father extends GranfFather {
	public void show1() {
		System.out.println("我是爸爸");
	}
}

class Son extends Father {
	public void show2() {
		System.out.println("我是儿子");
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