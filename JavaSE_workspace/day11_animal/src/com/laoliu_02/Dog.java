package com.laoliu_02;

import com.laoliu_01.Jump;

/**
 * 这是具体的狗类
 * @author caobrook
 * @version V1.0
 */
public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("会跳高的狗");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃肉");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("狗站着睡");
	}

}
