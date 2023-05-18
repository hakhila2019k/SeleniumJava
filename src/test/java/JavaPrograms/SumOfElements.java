package JavaPrograms;

public class SumOfElements {
	
	
	public static void main(String[]Args)
	{
		
		int fib1 = 0;
		int fib2 = 1;
		int sum= 0;
		System.out.println(fib1+" \n"+fib2);
		for(int i=1;i<=9;i++)
		{
			sum =fib1+fib2;
			System.out.println(sum);
			fib1=fib2;
			fib2=sum;
			
			
			
		}
		int a = 10;
	    int b=25;
	    
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    
	    System.out.println("\n \n "+a+"  "+b);
		int number  = 4;
		if(number%2==0)
		{
			System.out.println("\n \n The numebr is prime ");
		}
		else
		{
			System.out.println(" The number is not prime");
		}
		
		
		
		int arr[][] = {{1,2,5},{4,1,7},{4,3,1}};
		
		int min  = arr[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]>min)
				{
					
				min = arr[i][j];
				}
				
			}
		}
		
		System.out.println(min);
		
		
		
		
		

}
}
