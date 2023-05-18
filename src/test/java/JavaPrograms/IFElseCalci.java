package JavaPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class IFElseCalci {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter The num1: ");
//		BigInteger num1 = sc.nextBigInteger();
//		System.out.print("Enter The num2: ");
//		BigInteger num2 = sc.nextBigInteger();
//		BigInteger sum;
//		sum = num1.add(num2);
//		System.out.println(sum);
//		1280578611580.00
 
		int pass = 40;
		
		System.out.print("Enter my maths marks: ");
		int maths = sc.nextInt();
		
		if(maths>=pass)
		{
			if(maths>90)
			{
				System.out.println("I have got pass marks in maths && Got A Garde");
			}
			else if(maths>80)
			{
				System.out.println("I have got pass marks in maths && Got B Garde");
			}
			else if(maths>70)
			{
				System.out.println("I have got pass marks in maths && Got C Garde");
			}
			else if(maths>60)
			{
				System.out.println("I have got pass marks in maths && Got D Garde");
			}
		}
		else
		{
			System.out.println("OOPS... I Have Failed the exam ");
		}

	}

}
