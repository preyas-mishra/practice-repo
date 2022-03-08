package com.accessmodifierassignment;

import com.accessmodifierexample.ProtectedModifierAssignment;

//public class ProtectedModifierChecking {
//	public static void main(String[] args) {
//		ProtectedModifierChecking p1 = new ProtectedModifierChecking(); 

//		p1.show();            //Compilation error because superclass is not extended
//	}
//}


public class ProtectedModifierChecking extends ProtectedModifierAssignment{
public static void main(String[] args) {
	ProtectedModifierChecking p1 = new ProtectedModifierChecking(); 

	p1.show();            //Run Successfully because superclass is extended
	}
}