package Java100Programs;

import java.util.Scanner;

public class ScannerCode {

	public static void main(String[] args) {
		
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Number: " );
		int number = sc.nextInt();
		System.out.println("I Have entered the number "+number);
		
		ScannerCode obj = new ScannerCode();
		System.out.println("Loope will Start now ");
		obj.ForLoop(number);
		obj.Num();
		
		
		
		

	}
	
	void ForLoop(int num)
	{
		 
		for(int i = 1;i<=num;i++)
		{
			System.out.println(i);
		}
	}
	
	void Num()
	
	{
		System.out.println("My Name is peddiredy");
		
	}

}
