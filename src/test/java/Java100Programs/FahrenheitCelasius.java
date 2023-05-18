package Java100Programs;

import java.util.Scanner;

public class FahrenheitCelasius {

	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);
		System.out.println("Entere the celsius value:  ");
		int fah = sc.nextInt();
		int cel;
		//System.out.println(cel);
		
//		int fah;
//		fah = ((cel -32)*5)/9;
		
		cel = ((fah*9/5)+32);
		
		System.out.println(cel);
		

	}

}

