package com.csrk.apps;

import com.csrk.banks.AXIS;
import com.csrk.banks.ICICI;
import com.csrk.banks.SBI;

public class OverridingExampleApp {

	public static void main(String args[]) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of Interest: " + s.getRateOfIntrest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfIntrest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfIntrest());
	}
}