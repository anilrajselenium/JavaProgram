package com.csrk.apps;

import com.csrk.beings.Animal;
import com.csrk.beings.Dog;

public class AnimalApp {

	public static void main(String [] args) {
		
		Animal aDog = new Dog();
		aDog.says();
		System.out.println("A dog has "+aDog.getNoOfLegs()+" legs");
		
		System.out.println("Does the dog have tail?: "+(!aDog.isHasTail()));
		
		System.out.println("The arguments passed are: "+args[0]+" "+args[1]);
		
		
		int [] intArray = { 1,2,4,5};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("The "+i+"th vakue of array is: "+intArray[i]);
		}		
		

	}

}
