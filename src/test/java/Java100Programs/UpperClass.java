package Java100Programs;

import java.util.stream.IntStream;

public class UpperClass {

	public static void main(String[] args) {
		
//		Java Program: Change a string such that first character is upper case, 
//		second is lower case and so on?

		String s= "peddireddy";
		
		
		char c= s.charAt(0);
		int d = s.codePointAt(1);
		
		
		System.out.println(c);
		System.out.println(d);
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(i);
			if(i%2==0) {
				c= s.toUpperCase().charAt(i);
				//c=s.charAt(i);
				System.out.println(c);
			}
			else
			{
				c=s.charAt(i);
				System.out.println(c);
			}
			
		}
		for(int i=0;i<s.length();i++)
		{
		      d = s.codePointAt(i);
			System.out.println(d);
		}
	
	}

}
