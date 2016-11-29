package com.csrk.excercises;

public class NotAnInteger extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6530056360399687333L;

	@Override
	public String toString() {
      return "You have given an invlaid integer input. Please give valid integer as input";
	}
}
