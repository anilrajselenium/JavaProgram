package com.csrk.excercises;

public class Strink{
	public static void main(String [] args){
	 String str = "Welcome to D string method";
	 String str1 = "Welcome to A string method";
	 String emptyString="";

	 System.out.println(str.charAt(5));
	 System.out.println(str.compareTo(str1));
	 System.out.println(str.compareToIgnoreCase(str1));
	 System.out.println(str.indexOf("t"));
	 System.out.println(str.concat(str1));
	 System.out.println(str.isEmpty());
	}
}