package Java100Programs;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 0,b = 0,c;
		
		a=10;b=35;
		System.out.println("Before Swapping Numbers"+  a +" "  + b);
		
		c=a;
		a=b;
		b=c;
		System.out.println("Adfter swapping Number " +a+"  " + b);
 
		 
		a=b+a;
		b=a-b;
		a=a-b;
		
		System.out.println("After  2 swapping Number " +a+"  " + b);
		
		
		a=b*a;
		b=a/b;
		a=a/b;
		
		System.out.println("After  2 swapping Number " +a+"  " + b);
	}

}
