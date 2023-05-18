package Java100Programs;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int i ,fact,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter my new Number: ");
		num = sc.nextInt();
		
		fact  = factorial(num);
		
		System.out.println(fact);
		

	}

	public static int factorial(int i) {
		
		if(i==0)
		{
			return 1;
		}
		else
		{
			return i*factorial(i-1);
		}
		
		
		
	}

}
