interface Inter {
	void show();
}

class Outer {
	//�������
	public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

class InnerClassTest {
	public static void main(String[] args) {
		Outer.method().show();//��ʽ���
	}
}