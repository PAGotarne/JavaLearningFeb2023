package operators_in_java;
/* The java unary operators require only one operand.
 * Unary operators are used to perform various operations 
 *  . increment /decrement a value by one
 *  . negative an expression
 *  . inverting the value of boolen
 */
public class UnaryOperators {

	public static void main(String[] args) {
		int r= 10;
		System.out.println(r++);//10++ (11) post fix precedence + sign expression
		System.out.println(++r);//prefix precedence 12 (11+1)
		System.out.println(r--);//12 (12-1) (11) post fix precedence sign expression
		System.out.println(--r);//10 (1 -11) prefix precedence

	}

}
