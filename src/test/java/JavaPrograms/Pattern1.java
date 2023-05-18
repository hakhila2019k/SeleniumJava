package JavaPrograms;

public class Pattern1 {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		/*
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.printint(" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.printint("*");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.printint("*");
			}
			
			
			char c ;
		for(c='A';c<='z';c++)
		{
			System.out.printintln(c);
		}
			
		
			
			System.out.printintln();
		}
*/
/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.printint(j);
			}
			
			System.out.printintln();
		}
		for(int i=5;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.printint(j);
			}
			
			System.out.printintln();
		}
		
*/		
		/*
		for( i=5;i>=1;i--)
		{
			for( j=1;j<=5;j++)
			{
				System.out.print(" ");
			}
			for( j=1;j<=i;j++)
			{
//				System.out.print(i);
				System.out.print( i );
			}
			
			System.out.println();
		}
		
		for( i = 1;i<=5;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println( );
			
		}
		for( i = 5;i>=1;i--)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println( );
			
		}
		
		for( i = 1;i<=5;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print("");
			}
			for( j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			for( j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println( );
			
		}
		
		*/
		for(i=1;i<=5;i++)           // 1           2          3      4       5 
		{
			for(j=5;j>=i;j--)       // 5,4,3,2,1   5,4,3,2    5,4,3  5,4     5
			{
				System.out.print(i); //11111       2222       333    44      5
			}
			System.out.println();
		}
		
		System.out.println("\n ***********\n ");
		
		
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("\n **************\n ");
		
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("\n ****************\n ");
		
		
		
		for(i=1;i<=5;i++)           // 1           2          3      4       5 
		{
			for(j=5;j>=i;j--)       // 5,4,3,2,1   5,4,3,2    5,4,3  5,4     5
			{
				System.out.print(" "); //11111       2222       333    44      5
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i); 
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n ****************\n ");
		
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("\n ****************\n ");
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("\n ****************\n "); 
		
		
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}

}
