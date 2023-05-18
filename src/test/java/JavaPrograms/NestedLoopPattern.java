package JavaPrograms;

import java.awt.print.Printable;

public class NestedLoopPattern {

	public static void main(String[] args) {
		
		int i,j;
		int n=5;
		/*
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("-");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("-");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(i=1;i<=n;i++) //i=1,2,3,4,5
		{
			for(j=i;j<n;j++) // j= 1,2,3,4,5
			{
				System.out.print("-");
			}
			
			for(j=1;j<=i;j++)
			{
			 System.out.print(i);
			}
			
		  System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			
			
			for(j=1;j<=i;j++) 
			{
				System.out.print(i);
			}
			for(j=i;j<n;j++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
		*/
		for(i=1;i<n;i++)
		{
			for(j=i;j<n;j++) 
			{
				System.out.print(" ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print(i);
			}
			for(j=1;j<=i;j++) 
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++) 
			{
				System.out.print(" ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print(i);
			}
			for(j=i;j<=n;j++) 
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		
		for(i=1;i<=n;i++) 
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		for(i=1;i<=n;i++) 
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		for(i=1;i<=n;i++) 
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
			 System.out.print(" ");
			}
			for(j=i;j<=n;j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
