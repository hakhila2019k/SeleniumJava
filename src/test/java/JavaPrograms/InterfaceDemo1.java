package JavaPrograms;



interface Shape
{
	int number  = 10;
	int sum = 20;
	void M1(); //default methods
	default void m3()
	{
		
	}
	default void  m4()
	{
		
	}
}


public class InterfaceDemo1 implements Shape
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void M1() {
		
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

}
