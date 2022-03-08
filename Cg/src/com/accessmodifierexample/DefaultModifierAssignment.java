package com.accessmodifierexample;

import com.accessmodifierexample.PrivateModifierExample;         // Same Package
import com.accessmodifierassignment.DefaultModifierChecking;     //Different Package

public class DefaultModifierAssignment {

	public static void main(String[] args) {
		PrivateModifierExample p1 = new PrivateModifierExample();
		p1.display();
		
//		DefaultModifierChecking d1 = new DefaultModifierChecking();
//		d1.display();                                                  // Compilation error due to different package

	}

}
