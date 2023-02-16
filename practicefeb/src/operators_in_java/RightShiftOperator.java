package operators_in_java;
/* The java right shift operator >> is used to move left
 * operands value to right by the number of bits specified by
 * the right operand
 */
public class RightShiftOperator {

	public static void main(String[] args) {
		int s = 120;
		
		System.out.println(120>>2);// 120/2^2 = 120 /4 = 30
		System.out.println(s>>3);// 120/3^2 = 120 /9 = 15
		System.out.println(s>>4);// 120/4^2 = 120/16 = 7

	}

}
