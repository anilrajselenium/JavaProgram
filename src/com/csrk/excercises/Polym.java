package com.csrk.excercises;

public class Polym {
	
	/* Polymorphism is basically the combination of Method overloading and Method overriding.
	 * Method overloading  - having the same method name but different set of arguements.
	 * The arguements given in the method is also called signatrue.There can be 3 sets
	 * 	1.Number of arguements can be many (int a , int b, int c)
	 * 2.Type of arguements can be many (int a , double b)
	 * 3.Order of arguement ()
	 * 


*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polym.add(12, 56);
		Polym.add(12, 6, 78);
		Polym.add(12.44, 6, 78);
		
	}

	public static void add(int a , int b)
	{
		int c= a+b;
		System.out.println(c);
		
	}
	public static void add(int a , int b,int c)
	{
		int d= a+b+c;
		System.out.println(d);
		
	}
	public static void add(double a , int b,int c)
	{
		double d= a+b+c;
		System.out.println(d);
		
	}
	
}
