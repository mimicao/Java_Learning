interface Inter {
	void show();
}

class Outer {
	//²¹³ä´úÂë
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
		Outer.method().show();//Á´Ê½±à³Ì
	}
}