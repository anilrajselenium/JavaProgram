package com.csrk.excercises;

public class Febinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		a=0;
		b=1;
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		while (c<100)
		{
		a=b;
		b=c;
		c=a+b;
		System.out.println(c);
		}
				
		
	}

}
