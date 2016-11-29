package com.csrk.apps;

import com.csrk.excercises.OverloadExample;

public class OverloadExampleApp {

	
	public static void main(String[] args) {
		
		OverloadExample example = new OverloadExample();
		
		int integerNumber = 10;
		long longNumber = 100000000;
		
		example.methodNumberOverload(integerNumber);
		example.methodNumberOverload(longNumber);
	}

}
