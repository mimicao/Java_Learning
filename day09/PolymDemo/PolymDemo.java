/*
��̬�еĳ�Ա�����ص�:
A.��Ա���� 
	���뿴��ߣ�����Ҳ�����
B.���췽��
	������������ʱ�򣬷��ʸ���Ĺ��췽�����Ը������ݽ��г�ʼ��
C.��Ա����
	���뿴��ߣ����п��ұ�
D.��̬����
	���뿴��ߣ�����Ҳ�����
	����̬������أ��㲻����д�����Ʒ��ʵ�����ߵģ�
	
���ڳ�Ա�������ڷ�����д�����������п��ұ�
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