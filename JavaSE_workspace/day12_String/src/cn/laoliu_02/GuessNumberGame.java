package cn.laoliu_02;

import java.util.Scanner;

public class GuessNumberGame {
	private GuessNumberGame() {

	}

	public static void start() {
		int number  = (int) (Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("��������Ҫ�µ�����(1-100)");
			int guessnum = sc.nextInt();
			
			if(guessnum == number){
				System.out.println("��ϲ��¶��ˣ�");
				break;
			}else if(guessnum < number){
				System.out.println("�Բ���"+guessnum+"��С�ˡ�");
			}else{
				System.out.println("�Բ���"+guessnum+"�´��ˡ�");
			}
		}
		
		
	}
}
