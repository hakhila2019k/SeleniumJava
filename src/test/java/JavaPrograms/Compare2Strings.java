package JavaPrograms;

import java.util.Scanner;

public class Compare2Strings {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter my First String: ");
		String s1= sc.nextLine();
		
		System.out.print("Enter my Second String: ");
		String s2 = sc.nextLine();
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		*/
		
		String s1 = "Annapureddy";
		String s2 = "Peddireddy";
		if(s1.compareTo(s2)<0)
		{
			System.out.println(s1);	
			
		}
		else
		{
			System.out.println(s2);
			
		}
	}

}
