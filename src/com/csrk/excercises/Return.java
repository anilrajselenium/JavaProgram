package com.csrk.excercises;

import java.util.Scanner;

public class Return {

	public static void main (String[] args)
	{
		inpuText();
	}
		public static void inpuText()
		{
			 Scanner sn = new Scanner(System.in);
			String message = sn.nextLine();
			System.out.println(Hello(message));
		}
		
		public static String Hello(String message) // return methods will not have the void keyword.instead it will always have the return type...it can be string or int or boolean etc
		{
			if(message.equals("Hi"))
			{
				return "Hello";
			}
			else
			{
				return "GoodBye";
				
			}
			
		}
		
	}
	

