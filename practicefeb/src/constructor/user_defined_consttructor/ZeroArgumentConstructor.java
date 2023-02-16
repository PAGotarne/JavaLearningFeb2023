/*	>	We can initialise data member of a class
 * 	>	Constructor with no argument constructor is known as zero argument constructor or 
 * 		non argument constructor
 * 	>	The signature is same as a default constructor
 */
package constructor.user_defined_consttructor;

public class ZeroArgumentConstructor {
	
	//declaration
	static int a;
	static String name;
	
	//constructor
	ZeroArgumentConstructor(){
		//initiation
		a=20;
		name = "Pralhad";
		//usage
		System.out.println(a);
		System.out.println(name);
				
	}
	public static void main(String[] args) {
		ZeroArgumentConstructor xyz = new ZeroArgumentConstructor();

	}

}
