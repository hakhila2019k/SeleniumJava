package Java100Programs;

import java.util.Scanner;

public class SubStringProgram {

	public static void main(String[] args) {
		
		String string,sub = null;
		int length,i,j;
		String reverse =null;
		
		
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		length = string.length();
		for(i=0;i<=length;i++)
		{
			for(j=0;j<=length-i;j++)
			{
				sub = string.substring(i,i+j);
				System.out.println(sub);
			}
	}
		
		

}
	
}
