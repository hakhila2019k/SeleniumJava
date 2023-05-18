package Java100Programs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X value: ");
		int x = sc.nextInt();
		System.out.println("Enter the Y value: ");
		int y = sc.nextInt();
		System.out.println("Enter the Z value: ");
		int z = sc.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println(" Giving the largest valus as x "+ x);
		}
		else if(y>x && y>z)
		{
			System.out.println(" Giving the largest valus as Y "+y);
		}
		else
		{
			System.out.println(" Giving the largest valus as Z "+z);
		}
	}

}
