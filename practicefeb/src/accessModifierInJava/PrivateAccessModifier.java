/*	the access level of a private modifier is only within the class. It cannot be accessed from outside the class.
 * 	In this example, we have created two class A and PrivateAccessModifier. A class contains private data
 * 	member and private methods. We are accessing these private members from outside the class, so there 
 * 	is a compile-time error
 * 
 */
package accessModifierInJava;

public class A{
	private int data=40;
	private void msg() {
		System.out.println("Hello java");
	}
}
public class PrivateAccessModifier {

	public static void main(String[] args) {
		A obj= new A();
		System.out.println(obj.data);//Compile time error
		obj.msg();//Compile time error

	}

}
