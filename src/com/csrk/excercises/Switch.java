package com.csrk.excercises;

import java.util.Scanner;

public class Switch {

	public static void main(String [] args)
	{
			System.out.println("Enter the Value");
			Scanner inn = new Scanner(System.in);
			int num = inn.nextInt();

			
			switch(num)
			{
				case 1:
					System.out.println("I am Number 1");
				break;
				case 2:
					System.out.println("I am Number 2");
				break;
				case 3:
					System.out.println("I am Number 3");
				break;
				case 4:
					System.out.println("I am Number 4");
				break;
				case 5:
					System.out.println("I am Number 5");
				break;
				default:
				System.out.println("Its not a valid Value");
				
			}
			
	}

	private static void Switch(int num) {
		// TODO Auto-generated method stub
		
	}
}
