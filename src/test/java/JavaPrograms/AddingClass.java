package JavaPrograms;

public class AddingClass {

	public static void main(String[] args) {
		sumOf(12,13,14);
		sumOf(789,456,123);
	    sumOf(589,456,632);
		sumOf(1,2,3);
		Sub(5,4);
		Mul(25,45);
		Div(9,2);
		Fact(5,1);
		fib(0,1);
	}
	static void sumOf(int Num1,int Num2,int Num3)
	{
		//int Sub = Num2-Num1;
		int sum = Num1+Num2+Num3;
		System.out.println("My addition Of the number is: "+sum);
		
		
		
	}
	static void Sub(int num1,int num2)
	{
		int sub = num1-num2;
		System.out.println("My Substraction Of number is: " +sub);
	}
	
	static void Mul(int pr1,int pr2)
	{
		int mul = pr1*pr2;
		System.out.println("My Multiplication of Number is: " +mul);
	}
	static void Div(float obj,float num )
	{
		float div = obj/num;
		System.out.println("My Dividion of Number: "+div);
	}
	
	static void Fact(int n,int fact)
	{
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println(" My Factorial Number is: "+fact);
			
	}
	static void fib(int n1,int n2)
	{
		
		int n3;
		System.out.println(n1+" "+n2);
		for(int i=2;i<=10;i++)
		{
			n3=n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}























