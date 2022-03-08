// Testing Protected Modifier
package useforprotectedmodifier;

import com.accessmodifierexample.*;

class ProtectedChecking extends ProtectedModifierExample{
	public static void main(String[] args) {
		ProtectedChecking a1 = new ProtectedChecking();
		a1.show();	                                           // Run Successfully after extending superclass
	}
}

//class ProtectedChecking{
//	public static void main(String[] args) {
//		ProtectedChecking a1 = new ProtectedChecking();
//		a1.show();	                                           // Compilation error due to not extending the superclass
//	}
//}
