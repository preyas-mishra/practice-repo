package com.accessmodifierexample;

import com.usefordefaultmodifier.CustomerData;                  // Outside the package   
import com.accessmodifierexample.PrivateModifierExample;        // Inside the same package


public class DefaultModifierExample {

	public static void main(String[] args) {
		CustomerData cust = new CustomerData();
		//cust.display();                            //Compilation error due to default outside the package
		
		PrivateModifierExample p1 = new PrivateModifierExample();
		p1.display();                               // Run successfully due to default in same package
		
	}

}
