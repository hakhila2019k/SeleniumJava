package Java100Programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number armstrong number ");
		int num = sc.nextInt();
		int originalnumber,remainder;
		double result=0;
		
		originalnumber = num;
		while(originalnumber !=0)
		{
			remainder = originalnumber%10;
			result = result+Math.pow(remainder,2);
			originalnumber = originalnumber/10;
			
		}
		
		if(num == result )
		{
			System.out.println(result+ "is the armstrong Number");
		}
		else
		{
			System.out.println(result +"is not the armstring number");
		}

	}

}
