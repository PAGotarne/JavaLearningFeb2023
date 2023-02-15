package method_practice;
//Making methods call within class/single class
public class SingleClass {
	public void test()
	{
		System.out.println("MY non-static methos");
	}
	
	public static void test1()
	{
		System.out.println("my static method 1");
	}
	
	public static void test2()
	{
		System.out.println("my static mmethod 2");
	}
	
	public static void main (String []args)
	{
		SingleClass a = new SingleClass();
		a.test(); //if method is not static then need to create a object to call the methods
		SingleClass.test1();
		SingleClass.test2();
	}
}
