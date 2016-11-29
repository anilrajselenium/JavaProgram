package com.csrk.excercises;

public class ConvertToString

{

public static void main(String[] arg)

	{

		int x = 345;        // declare an int variable
		Integer y = new Integer(x);  // wrap the int variable in an Integer object
		String s = Integer.toString(y); // converts the integer into a string
		System.out.println(s);
		
		
		
	}

}