package com.csrk.excercises;

import java.util.Scanner;

public class Tostring {

	public static void main(String[] args)
	{
	System.out.println("Enter a valid Integer");	
	Scanner sn = new Scanner(System.in);
	int myint= sn.nextInt();
	String mystr="";
	
	mystr=Integer.toString(myint);
	System.out.println("And the converted string is = "+ mystr);
	}
	
	
}
