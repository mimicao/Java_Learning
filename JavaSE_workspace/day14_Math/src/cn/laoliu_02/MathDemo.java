package cn.laoliu_02;

/*
 * ʵ�ֻ�ȡ���ⷶΧ��������
 */
public class MathDemo {
	public static void main(String[] args) {
		while(true){
			System.out.println(getRandom(0, 2000));
		}
	}

	public static int getRandom(int start, int end) {
		int result;
		
		result = start+(int)(Math.random()*Math.abs(start-end+1));
		
		return result;
	}
}