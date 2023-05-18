package JavaPrograms;

public class CharLoop {

	public static void main(String[] args) {
		
		
		char ch;
		for(ch = 'A';ch<'z';ch++)
		{
			System.out.print(ch);
		}
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		
		for(int n:num)
		{
			System.out.println("\n Loop " +n);
		}
		
		int a =5,b;
		for(int i =1;i<=10;i++)
		{
			b=a*i;
			System.out.println("\n "+a+"*"+i+"="+b);
		}
	}

}
