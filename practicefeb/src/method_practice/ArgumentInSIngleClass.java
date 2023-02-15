package method_practice;
//making method call with argument within class/single class
public class ArgumentInSIngleClass {

	public void one()
	{
		System.out.println("My 1 non-static method");
	}//1 non static method we called this method overloading because one() are the two same 
	//name non static methods this 1st with no argument
	
	public void one(int d)
	{
		System.out.println("My 2 non static method");
	}// this is 2 non static method called it as method overloading as two method with dame name
	// with argument
	
	public static void two()
	{
		System.out.println("My 3 static method");
	}
	
	public static void two(int b, int s)
	{
		System.out.println("My 4 static method");
	}	
	public static void main(String[] args) {
		ArgumentInSIngleClass a = new ArgumentInSIngleClass();
		a.one();
		a.one(23);
		two();
		two(14,67);
	}

}
