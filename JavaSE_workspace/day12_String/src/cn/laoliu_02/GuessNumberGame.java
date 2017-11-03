package cn.laoliu_02;

import java.util.Scanner;

public class GuessNumberGame {
	private GuessNumberGame() {

	}

	public static void start() {
		int number  = (int) (Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("请输入你要猜的数据(1-100)");
			int guessnum = sc.nextInt();
			
			if(guessnum == number){
				System.out.println("恭喜你猜对了！");
				break;
			}else if(guessnum < number){
				System.out.println("对不起"+guessnum+"猜小了～");
			}else{
				System.out.println("对不起"+guessnum+"猜大了～");
			}
		}
		
		
	}
}
