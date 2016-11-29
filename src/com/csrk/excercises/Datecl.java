package com.csrk.excercises;

import java.util.Date;

/**
 * This  class converts a date into printable format.
 * @author anilraj
 *
 */
public class Datecl {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date using toString()
      String str = String.format("Current Date/Time : %tc", date );

      System.out.printf(str);
   }
}