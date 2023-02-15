package method_practice;
//making call from different class(two or more)
public class DifferentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("method call from different class");
		SingleClass a = new SingleClass();//methods call from different class
		a.test();
		SingleClass.test1();//syntax for calling static method in different class or same class
		SingleClass.test2();
		
		System.out.println("Method call from same class");
		DifferentClass b = new DifferentClass();
		b.infoOne();
		DifferentClass.infoTwo();
	}
	
	public void infoOne()
	{
		System.out.println("My non-static method of differntclass name");
	}
	
	public static void infoTwo()
	{
		System.out.println("My static method within same class");
	}

}
