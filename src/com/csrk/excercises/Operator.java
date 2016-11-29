package com.csrk.excercises;

import java.util.Scanner;

public class Operator {

	public static void main(String [] args)
	
	{
		int i,j,k;
		String oper;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the first number");
		i=in.nextInt();
		System.out.println("Enter the second number");
		j=in.nextInt();
		System.out.println("Enter the operator");
		Scanner op = new Scanner(System.in);
		oper = op.next();
		
		if(oper.equals("+"))
		{
			System.out.println("The output is ="+ (i+j));
		}
		if(oper.equals("-"))
		{
			System.out.println("The output is ="+ (i-j));
		}
		if(oper.equals("/"))
		{
			System.out.println("The output is ="+ (i/j));
		}
		if(oper.equals("*"))
		{
			System.out.println("The output is ="+ (i*j));
		}
	}
 }		