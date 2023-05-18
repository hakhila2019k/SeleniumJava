package JavaPrograms;

import java.util.Scanner;

public class IndexOut {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		int a[] = new int[5];
		int Num = 0;
		
		
//		System.out.println("Give me The number: ");
//		int Num = sc.nextInt();	
		
		
		System.out.println("Enter the position of element {0-5} :   ");
		//int Pos = sc.nextInt();
		
		try 
		{
			
			int num = 0;
			int sum=25;
			System.out.println(num);
			System.out.println(sum/0);
			
			
			/*	
			for(int Pos=0; Pos<=5 ;Pos++)
			{
				System.out.print("Give me The number: ");
				Num = sc.nextInt();	
				a[Pos] = Num;
				System.out.println("My input and out for Number :   "+a[Pos]);
			}
			for(int i=0;i<=a.length;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print("[ "+a[i]+"]");
				}
				System.out.println();
			}
			*/
		
		}
		catch(Exception e)
		{
			//System.out.println("\n \nYou have Given index out of elements:  ");
			//System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
		}
		finally 
		{
			
			for(int Pos=0; Pos<5 ;Pos++)
			{
				System.out.print("Give me The number: ");
				Num = sc.nextInt();	
				a[Pos] = Num;
				System.out.println("My input and out for Number :   "+a[Pos]);
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print("[ "+a[i]+"]");
				}
				System.out.println();
		}
			
		}
		
		
		
		
		
		
		
	}

}
