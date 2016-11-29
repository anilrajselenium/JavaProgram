package com.csrk.apps;

import java.util.Scanner;

import com.csrk.excercises.Calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int a = sn.nextInt();
		int b = sn.nextInt();		
		
		Calculator calculator = new Calculator();
		
		System.out.println("The addition of "+a+" and "+b+" is: "+calculator.add(a, b));
		System.out.println("The addition of "+a+" and "+b+" is: "+calculator.substract(a, b));
				System.out.println(calculator.);
	}

}
