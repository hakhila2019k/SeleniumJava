package JavaPrograms;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {

		System.out.println(" Peddireddy Hari Vardhan reddy....");
		
		// Control statements 
		// conditional statements --> If else 
		//looping statements --> for loop ,While Loops
		// jumping statements --> Break ,Continue
		
		
		// Conditional statements 
		//Types of conditionals 
		
		// if condition
		// if-else condition
		// nested if else condition
		// switch case statements
		
		// if (Condition? True:False) {Statements;}
		
		/*
		int age = 15;
		if(age >=10) {
			System.out.println(" Eligible for vote ......");
		}
		else
		{
			System.out.println("Not Eligib;e for vote >>>>>>");
		}
		
		for(String t :args)
		{
			System.out.println(t);
		}
		*/
		Scanner sc  = new Scanner(System.in);
//		System.out.print("Enter the integer Value....: ");
//		int var = sc.nextInt();
//		System.out.println("My Value Integer is ..."+ var);
//		
//		System.out.print("Enter the String Value:   ");
//		String S = sc.next();
//		System.out.println("My Value of a String is:  " + S);
		
		
		/*
		// Find the number is even or odd 
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(num==0)
		{
			System.out.println("My Number " + num +" is Zero ");
			
		}
		else if(num%2==0)
		{
			System.out.println("My number  " + num +" is even");
		}
		else
		{
			System.out.println("My Number " + num +" is odd ");
		}
		
		if(num>0)
		{
			System.out.println("My Number " + num +" is Positive ");
			
		}
		else if (num==0)
		{
			System.out.println("My Number " + num +" is Zero ");
			
		}
		else
		{
			System.out.println("My Number " + num +" is Negative");
		}
		
		
		//One number with another number comparision
		
		*/
//		System.out.print("Enter a Value: ");
//		int a = sc.nextInt();
//		System.out.print("Enter b Value: ");
//		int b = sc.nextInt();
//		System.out.print("Enter c Value: ");
//		int c = sc.nextInt();
//		
//		if(a>b && a>c)
//		{
//			System.out.println(a +" a : number is largest");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println(b +" b : number is largest");
//		}
//		else
//		{
//			System.out.println(c +" c : number is largest");
//		}
//		
//		System.out.print(" Enter the fahrenheit Value:  ");
//		float temp = sc.nextInt();
//		
//		temp = ((temp-32)*5)/9;
//		System.out.println(" My fahrenheit Value is : " +String.format("%.2f",temp));
//		
//		System.out.print(" Enter the celsius Value:  ");
//		float tem = sc.nextInt();
//		
//		tem = ((9*tem)/5)+32;
//		System.out.println(" My fahrenheit Value is : " +String.format("%.2f",tem));
//		
//		Swap 2 Numbers with out using third varible 
//		
//		System.out.print("Enter a Value: ");
//		int a = sc.nextInt();
//		System.out.print("Enter b Value: ");
//		int b = sc.nextInt();
//		System.out.print("Enter c Value: ");
//		int c = sc.nextInt();
//		a = b-a;
//		b = b-a;
//		a = a+b;
//		
//		System.out.println(" After Conversion of numbers : "+ a +" , "+ b);
//		
//		StringBuffer sb = new StringBuffer(String.valueOf(a));
//		StringBuffer rev = sb.reverse();
//		System.out.println(rev);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

		
		
		
		
		
	}

}
