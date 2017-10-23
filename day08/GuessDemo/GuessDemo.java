import java.util.Scanner;

class GuessDemo {
	public static void main(String[] args) {
		int number = (int)(Math.random()*100)+1;
		
		//System.out.println(number);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("请输入1-100的数字来比较");
			int input = sc.nextInt();
			
			if(input<number) {
				System.out.println("你猜的数字小了");
			}else if(input>number) {
				System.out.println("你猜的数字大了");
			}else {
				System.out.println("恭喜你答对了");
				break;
			}
		}
	}
}