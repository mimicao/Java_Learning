class Fu {
	final int x;
	
	{
		x=10;
	}
	
	/*FinalDemo.java:5: 错误: 无法为最终变量x分配值
	//被final修饰的变量无法被修改，及final修饰的变量为自定义常量
	public void Change(int x) {
		this.x = x;
	}*/
	
	public void show() {
		System.out.println(this.x);
	}
}

class Zi extends Fu {
	
}

class FinalDemo {
	public static void main(String[] args) {
		Zi z = new Zi();
		//z.Change(20);
		z.show();
	}
}