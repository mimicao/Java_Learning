class Fu {
	final int x;
	
	{
		x=10;
	}
	
	/*FinalDemo.java:5: ����: �޷�Ϊ���ձ���x����ֵ
	//��final���εı����޷����޸ģ���final���εı���Ϊ�Զ��峣��
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