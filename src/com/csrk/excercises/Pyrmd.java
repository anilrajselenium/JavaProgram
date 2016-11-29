package com.csrk.excercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyrmd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Engter a Number");
		int num = Integer.parseInt(reader.readLine());
		
		for(int i=0;i<=num;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
				
			}
			System.out.println("");

		}
			
			
		}
	}
