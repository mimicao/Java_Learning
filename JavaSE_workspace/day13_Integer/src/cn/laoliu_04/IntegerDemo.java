package cn.laoliu_04;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer ii = 100;
		ii+=200;
		System.out.println(ii);
		
//		Integer ii = Integer.valueOf(100); // �Զ�װ��
//		ii = Integer.valueOf(ii.intValue() + 200); // �Զ����䣬���Զ�װ��
//		System.out.println(ii);
		
		Integer iii = null; // NullPointerException
		if(iii != null) {
			iii += 1000;
			System.out.println(iii);			
		}

	}
}