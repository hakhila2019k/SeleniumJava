package JavaPrograms;

public class TestPattern {

	public static void main(String[] args) {
	
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n Program 1 completed  \n ");
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n  Program 2 completed \n ");
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
				//System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n  Program 3 completed \n ");
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("\n  Program 4 completed  \n ");
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
				
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		
		System.out.println("\n  Program 5 completed  \n ");

		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
				
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("Right angled triangle \n ");
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("\nReverse Right Angled Traingle \n ");
		
		for(i=5;i>=1;i--)
		{
			for(j=5;j<=i;j++)
			{
				System.out.print("");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("Both Reversed and Correct Right Angled Traingle");
		
		for(i=1;i<=5;i++)
		{
			for(j=5;j<=i;j++)
			{
				System.out.print("");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(i=5;i>=1;i--)
		{
			for(j=5;j<=i;j++)
			{
				System.out.print("");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		for(i=1;i<=5;i++)
		{
			for(j=i;j<5;j++)
			{
				System.out.print("-");
			}
//			for(j=1;j<=i;j++)
//			{
//				System.out.print(i);
//			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(i=5;i>=1;i--)
		{
			for(j=i;j<5;j++)
			{
				System.out.print("-");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
