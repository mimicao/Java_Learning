/*
多态中的成员访问特点:
A.成员变量 
	编译看左边，运行也看左边
B.构造方法
	创建子类对象的时候，访问父类的构造方法，对父类数据进行初始化
C.成员方法
	编译看左边，运行看右边
D.静态方法
	编译看左边，运行也看左边
	（静态和类相关，算不上重写，左移访问的是左边的）
	
由于成员方法存在方法重写，所以它运行看右边
*/

class Fu {
	public int num = 100;
	
	public void show() {
		System.out.println("Show Fu");
	}
	
	public static void function() {
		System.out.println("Function Fu");
	}
}

class Zi extends Fu {
	public int num = 1000;
	public int num2 = 100;
	
	public void show() {
		System.out.println("Show Zi"+num);
	}
	
	public void method() {
		System.out.println("method Zi");
	}

	public static void function() {
		System.out.println("Function Zi");
	}
}

class PolymDemo {
	public static void main(String[] args) {
		Fu f = new Zi();
	
		System.out.println(f.num);
		//System.out.println(f.num2);
		
		f.show();
		//f.method();
		f.function();
	}
}