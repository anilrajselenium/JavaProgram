package com.csrk.excercises;

public class Booleancompare {

	   public static void main(String[] args) {

	      // create 2 Boolean objects b1, b2
	      Boolean b1, b2;

	      // assign values to b1, b2
	      b1 = new Boolean(true);
	      b2 = new Boolean(false);
	      b1=true;
	      

	      // create an int res
	      int res;

	      // compare b1 with b2
	      res = b1.compareTo(b2);

	      String str1 = "Both values are equal ";
	      String str2 = "Object value is true";
	      String str3 = "Argument value is true";

	      if( res == 0 ){
	      	 System.out.println( str1 );
	      }
	      else if( res > 0 ){
	      	 System.out.println( str2 );
	      }
	      else if( res < 0 ){
	      	 System.out.println( str3 );
	      }
	   }
	}
