package com.csrk.beings;

public class Dog extends Animal {

	public Dog() {
		System.out.println("I'm in Contructor method");
		noOfLegs = 4;
		hasTail=true;
	}

	@Override
	public void says() {
       System.out.println("Woof!Woof");
	}
}