// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConstructDemo.java

import java.io.PrintStream;

class Student
{

	private String name;
	private int age;

	public Student()
	{
		System.out.println("�����޲ι���");
	}

	public void show()
	{
		System.out.println((new StringBuilder()).append("������").append(name).append("--------").append("���䣺").append(age).toString());
	}
}
