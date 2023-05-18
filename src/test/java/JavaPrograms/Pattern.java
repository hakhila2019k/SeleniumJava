package JavaPrograms;

public class Pattern {

	public static void main(String[] args) {
		
		int i,j;
		
		int n = 5;
		
		/*
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
		
		{
			System.out.print(" * ");
		}
		System.out.println( );
		}
		
		*/
		
		for(i=1;i<=n;i++)
		{
				for(j=i;j<=n;j++)
					
				{
					System.out.print("  ");
				}
				
				
				
					
					for(j=1;j<=i;j++)
						
					{
						System.out.print("* ");
					}
					
					
					
							for(j=1;j<=i;j++)
								
							{
								System.out.print("* ");
							}
			
			
			
			
			
			
			
			
			
			
			System.out.println( );	
		}
		
		
	}

}
