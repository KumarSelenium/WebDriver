package com.manoj.java;

public class Vasu
{

	//variables
	int i=20;
	//method
	public void add()
	{
		int a=20;
		int b=30;
		int sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		//object
		Vasu v=new Vasu();
		v.add();//method
		System.out.println(v.i);//variable

	}

}
