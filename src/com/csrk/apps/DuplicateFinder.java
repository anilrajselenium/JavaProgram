package com.csrk.apps;

import com.csrk.excercises.DuplicateElement;

public class DuplicateFinder {

	public static void main(String[] args) {
		DuplicateElement dupe = new DuplicateElement();
		
		//no duplcites
		String [] strArray1=
			 {"abc","def","ghi","jkl","mno","pqr","stu"};
		dupe.printDuplicates(strArray1);
		//all duplicates
		String [] strArray2 = {"abc","abc","def","def","ghi","ghi"};
		dupe.printDuplicates(strArray2);
	}

}
