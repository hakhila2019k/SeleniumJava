package JavaPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		
		int nu = factorial(8);
		int su = factorial(10);
		
		System.out.println(nu);
		System.out.println("my Number is:" +su);
		System.out.println(" my Number is 5 and factorial is :"+factorial(5));
		
		}
				static int factorial(int n)
				{
					
					if(n==1)
					{
						return 1;
					}
					else
					{
						return (n*factorial(n-1));
					}
				}
}
		


//		Scanner sc = new Scanner(System.in);
		
//		int fact = 1;
//		if(num<=0)
//		{
//			System.out.println("Please Enter a Non Negative Number ");
//		}
//		else 
//		{
//			for(int i = 1;i<=num;i++)
//			{
//				System.out.print("My Factorial Number is: " +i);
//				fact=fact*i;
//				System.out.println("\n"+fact);
//			}
//		}
		
		
//		Calculate the factorial of Large Number:
		/*
		 * int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		
		BigInteger num= new BigInteger("1");
		BigInteger fac = new BigInteger("1");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextBigInteger();
		
		for(int i =0 ;i<=5;i++)
		{
			fac = fac.multiply(num);
			num=num.add(BigInteger.ONE);
			
		}
		System.out.println(fac);
		
		System.out.println(fact);
		BigInteger inc = new BigInteger("1");
		BigInteger fact1 = new BigInteger("1");
		
		System.out.print("Enter The Number: ");
		int num = sc.nextInt();
		
		for(int i = 1;i<=num;i++)
		{
			
			fact1=fact1.multiply(inc);
			inc = inc.add(BigInteger.ONE);
			
		}
		
			

}
*/
