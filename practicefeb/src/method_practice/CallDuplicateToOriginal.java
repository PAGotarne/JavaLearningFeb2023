package method_practice;
/* now we are calling part one (CallArgumentInDifferentClass) methods on the part 2 
 * (CallDuplicateToOriginal) means we are methods calling with argumnet in different class
 */
public class CallDuplicateToOriginal {

	public static void main(String[] args) {
		CallArgumentInDifferentClass g = new CallArgumentInDifferentClass();
		g.duplicate(90);
		g.duplicate(45, "Pralhad");
		CallArgumentInDifferentClass.duplicate(54, 65);
		CallArgumentInDifferentClass.duplicate(97, "om", 76);
	}

}
/* In this part 2 as we are not writing any methods but
* by using methods calling concept we can access 
* methods with argument in different class
*/