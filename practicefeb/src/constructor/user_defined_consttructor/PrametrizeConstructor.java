/*	> 	Parameterize constructor a constructor is called as parameterised constructor
 * 	> 	When it accepts a specific number of a parameter or argument in a signature bracket to
 * 		initialise data member of a class with a distinct value
 * 	>	This constructor is used to allow multiple constructor by providing different type of argument in
 * 		simple words constructors with argument is known as parameters constructors
 * 	>	access scope of this constructor will be same as a class access code it means if class is a public
 * 		then constructor is public hip classes private then constructor is private or vise versa
 *	>	constructor are going to invoke/use at the time of object creation at the time of object creation
 */
package constructor.user_defined_consttructor;

public class PrametrizeConstructor {

	String city;
	PrametrizeConstructor()
	{
		city="Pune";
		System.out.println(city);
	}
	PrametrizeConstructor(int a)
	{
		System.out.println(a);
	}
	PrametrizeConstructor(String name)
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		PrametrizeConstructor obj1 = new PrametrizeConstructor();
		PrametrizeConstructor obj2 = new PrametrizeConstructor(34132847);
		PrametrizeConstructor obj3 = new PrametrizeConstructor("pralhad");

	}

}
