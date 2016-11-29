package com.csrk.excercises;

public class Monthfind {
	public String findMonth(String i) throws NotAnInteger{
		String returnMonth=null;
		try{
		int monthNumber = Integer.parseInt(i);
		
		
		switch (monthNumber) {
		case 1:
			 returnMonth="January";
			break;
		case 2:
			 System.out.println("February");
			break;
		}
		}catch(NumberFormatException exp){
			throw new NotAnInteger();
		}
		return returnMonth;
	}

}
