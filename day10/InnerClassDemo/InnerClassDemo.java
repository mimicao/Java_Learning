/*
	�ڲ����λ��
*/
interface Inter {
	public abstract void show();
	public abstract void show2();
}

class Outer {
	private int num = 10;
	
	//��Աλ��
	
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
		//�ֲ�λ��
		/**/
		class Inner {
			public void show() {
			//int num = 30;
			System.out.println(num);
			//���ڲ����з��ʱ��ر���num2; ��Ҫ������Ϊ��������
			System.out.println(num2);
			//System.out.println(Outer.this.num);				
			}
		}
		Inner i = new Inner();
		i.show();
	}
	
	//�����ڲ���
	
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

