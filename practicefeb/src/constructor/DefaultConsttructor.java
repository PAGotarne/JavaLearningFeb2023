/* > If constructor is not declared in class then at the time compilation compiler
 * will provide/consider the constructor
 * > If programmer declare  constructor then compiler will not provide any default constructor
 * > If constructor provided by compiler at the time of compilation is known as default constructors
 * > The best example of default constructor is main method
 */
package constructor;

public class DefaultConsttructor {

	public void method1() {
		String name = "pralhad";
		System.out.println(name);
	}
	public static void main(String[] args) {
		DefaultConsttructor obj=new DefaultConsttructor();
		obj.method1();

	}

}
