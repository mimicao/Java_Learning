/*
	内部类的位置
*/
interface Inter {
	public abstract void show();
	public abstract void show2();
}

class Outer {
	private int num = 10;
	
	//成员位置
	
	/*
	class Inner {
		private int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer.this.num);
			
		}
	}*/
	
	public void method() {
		final int num2 = 20;		
		//局部位置
		/**/
		class Inner {
			public void show() {
			//int num = 30;
			System.out.println(num);
			//从内部类中访问本地变量num2; 需要被声明为最终类型
			System.out.println(num2);
			//System.out.println(Outer.this.num);				
			}
		}
		Inner i = new Inner();
		i.show();
	}
	
	//匿名内部类
	
	public void method1() {
		/*new Inter() {
			public void show() {
				System.out.println("show");
			}			
			
			public void show2() {
				System.out.println("show2");
			}
		}.show();
		
		new Inter() {
			public void show() {
				System.out.println("show");
			}			
			
			public void show2() {
				System.out.println("show2");
			}		
		}.show2();*/
		
		Inter i = new Inter() {
			public void show() {
				System.out.println("show");
			}			
			
			public void show2() {
				System.out.println("show2");
			}		
		};
		
		i.show();
		i.show2();
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		/*
		Outer.Inner in = new Outer().new Inner();
		in.show();		
		*/
		
		Outer ou = new Outer();
		ou.method();
		ou.method1();
	}
}

