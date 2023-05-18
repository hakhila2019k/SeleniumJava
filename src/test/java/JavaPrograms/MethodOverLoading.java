package JavaPrograms;

public class MethodOverLoading {
	int a,b,c;

	public static void main(String[] args) {
	
		
		MethodOverLoading mp = new MethodOverLoading(10,20,30);
		mp.details();
		mp.methods();
		mp.add(120);
		mp.add(10);
		mp.add(20,30);
		mp.add(40,50,60);
		
		 
		 

}
	MethodOverLoading(int A,int B,int C)
	{
		a=A;
		b=B;
		c=C;
		
	}
	
	void details()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	void methods()
	{
		int num = 10;
		int num1=20;
		System.out.println(num);
		System.out.println(num1);
	}
	
	
	void add()
	{
		int x=10;
		int y=20;
		int z=30;
		System.out.println(x+y+z);
	}
	void add(int A)
	{
		a=A;
		System.out.println(a);
		
	}
	void add(int A,int B,int C)
	{
		a=A;
		b=B;
		c=C;
		System.out.println(a+b+c);
	}
	
	void add(int A,int B)
	{
		a=A;
		b=B;
		System.out.println(a+b);
	}
	
	
}

