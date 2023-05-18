package JavaPrograms;

import java.util.LinkedHashSet;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		
		//Calci(25,95);
		
		
		      String str = "Hello, World!";
		      
		      // Using a LinkedHashSet to remove duplicates while preserving order
		      LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		      for (int i = 0; i < str.length(); i++) {
		         set.add(str.charAt(i));
		      }
		      
		      // Converting the set back to a string
		      StringBuilder sb = new StringBuilder();
		      for (Character c : set) {
		         sb.append(c);
		      }
		      String uniqueStr = sb.toString();
		      
		      // Printing the unique string
		      System.out.println("String with duplicates removed: " + uniqueStr);
		   }
		

	
		static void Calci(int num1,int num2)
		{
			int sum=num1+num2;
			System.out.println(sum);
		}

}
