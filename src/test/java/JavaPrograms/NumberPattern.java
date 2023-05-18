package JavaPrograms;

public class NumberPattern {

	public static void main(String[] args) {
		
		int i ,j;
		int n=5;
		
		int p=5;
		
		
		for(i=1;i<n;i++,p--)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print(p+"");
			}
			for(j=i;j<=n*2-1;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(p+"");
			}
			System.out.println();
		}
		/*
		for(i=1;i<=n;i++,p++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print(p+" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(i=1;i<n;i++,p++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print(p+" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(p+" ");
				
			}
			

			System.out.println();
		}
		for(i=1,p=5;i<n;i++,p--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print(p+" ");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(p+" ");
				
			}
			

			System.out.println();
		}
		
		
		
		
		
		for(i=1,p=n;i<=n;i++,p--)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print(p+" ");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(p+" ");
			}
			
			System.out.println();
		}
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		for(i=1;i<n;i++,p++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print(p+" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(p+" ");
				
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(p+" ");
				
			}
			System.out.println();
		}
		

		for(i=1,p=n;i<=n;i++,p--)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print(p+" ");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		for(i=1,p=1;i<n;i++,p++)
		{
			int q=1;
			for(j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print(p+1 +" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(q++ +" ");
			}
			System.out.println();
		}
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(i=1;i<n;i++)
		{
			for(j=i;j<=n;j++) 
			{
				System.out.print(" ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print("*");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1;i<=5;i++)
		{ 
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print("*");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int p;
		for(i=1,p=5;i<=n;i++,p--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print(p+2+" ");
			}
			
			for(j=i;j<=n;j++)
			{
				System.out.print(p+2+" ");
			}
			System.out.println();
		}
		for(i=1,p=0;i<=n;i++,p+=2)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		for(i=1,p=1;i<n;i++,p++)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print("  ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print(p+" ");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		for(i=1,p=1;i<=n;i++,p++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<i;j++) 
			{
				System.out.print(p+" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(p+" ");
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
				System.out.print(" ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print(j);
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
			for(j=i;j<n;j++)
			{
				System.out.print(i);
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		*/

	}

}
