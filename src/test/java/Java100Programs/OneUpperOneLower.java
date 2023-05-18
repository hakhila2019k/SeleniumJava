package Java100Programs;

import java.util.Scanner;

public class OneUpperOneLower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String s = "peddireddyharivardhanreddy";
		int len  = s.length();
		char ch = 0;
		
		
		
		for(int i=0;i<len;i++)
		{
			int j = i/2;
			if(s.charAt(j)!=0)
			{ 
				
				
				String Upper = s.toUpperCase();
				System.out.println(Upper);
			}
		}
	}

}
