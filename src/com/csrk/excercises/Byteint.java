package com.csrk.excercises;

public class Byteint{

   public static void main(String[] args) {

   Integer obj = new Integer(10);
 
   // returns the value of Integer as a byte
   byte b = obj.byteValue();
   Byte byteObject = new Byte(b);
   System.out.println("Value of b = " + byteObject.byteValue() +" " +byteObject.toString());
   }
}