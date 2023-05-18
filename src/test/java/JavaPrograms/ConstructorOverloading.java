package JavaPrograms;

public class ConstructorOverloading {
	int a,b,c;
	
	
	ConstructorOverloading()
	{
		int a = 10;
		System.out.println(a);
	}
	
	ConstructorOverloading(int a)
	{
		this.a=a;
	}
	
	ConstructorOverloading(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	ConstructorOverloading(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	void details()
	{
		System.out.println("1:   "+(a));
		System.out.println("2:   "+ (a+b));
		System.out.println("3:   "+ (a+b+c));
		System.out.println("4:    "+(a));
	}
	
	public static void main(String[] args)
	{
		ConstructorOverloading mo = new ConstructorOverloading(10,20,30);
		mo.details();
		

	}

}
