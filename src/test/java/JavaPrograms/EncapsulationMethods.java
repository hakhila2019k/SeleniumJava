package JavaPrograms;

public class EncapsulationMethods {

	
	static int a =10;
	int b=100;
	
	public static void main(String[] args) 
	{
		
		
//		System.out.println(a);
		EncapsulationMethods em = new EncapsulationMethods();
//		System.out.println(em.b);
		em.m1();
		EncapsulationMethods.num();

	}
	
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void num()
	{
		System.out.println(a);
		EncapsulationMethods em1 = new EncapsulationMethods();
		System.out.println(em1.b);
	}

}
