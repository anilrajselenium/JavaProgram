package com.csrk.excercises;
import java.lang.*;

public class Inte {

	   public static void main(String[] args) {

	   // compares two Integer objects numerically
	   Integer obj1 = new Integer("25");
	   Integer obj2 = new Integer("10");
	   int retval =  obj1.compareTo(obj2);
	    
	   if(retval > 0) {
	   System.out.println("obj1 is greater than obj2");
	   }
	   else if(retval < 0) {
	   System.out.println("obj1 is less than obj2");
	   }
	   else {
	   System.out.println("obj1 is equal to obj2");
	   }
	   }
	} 
