package cn.laoliu_02;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(list.size() < 10){
			int num = r.nextInt(20) + 1;
			if(!list.contains(num)){
				list.add(num);
			}
		}
		
		for(Integer i: list){
			System.out.println(i);
		}
	}
}
