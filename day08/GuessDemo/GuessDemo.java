import java.util.Scanner;

class GuessDemo {
	public static void main(String[] args) {
		int number = (int)(Math.random()*100)+1;
		
		//System.out.println(number);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������1-100���������Ƚ�");
			int input = sc.nextInt();
			
			if(input<number) {
				System.out.println("��µ�����С��");
			}else if(input>number) {
				System.out.println("��µ����ִ���");
			}else {
				System.out.println("��ϲ������");
				break;
			}
		}
	}
}