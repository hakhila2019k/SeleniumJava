package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntrQuestions {

	public static void main(String[] args) {
		// Print Highest String in the array 
		
		String []  arr = {"simplicity","Hardworking","MachineLearning","dirtymindharivardhhanreddypeddireddy"};
		
		String longs = Arrays.stream(arr).reduce((word1,word2)->(word1.length()>word2.length())?word1:word2).get();
		System.out.println(longs);
				    		  
	    // Print Half the string Into Upper case and another half into Lower case 
		
		int mid = longs.length()/2;
		
		System.out.println(mid);
		
		String Low = "";
		String Up = "";
		 
		for(int i=0;i<longs.length();i++)
		{
			if(i<mid) 
			{
				Low = Low+Character.toLowerCase(longs.charAt(i));
				//Low = Low.toUpperCase();
				
			}
			else
			{
				Up = Up+Character.toUpperCase(longs.charAt(i));
				//Up = Up.toLowerCase();
			}
		}
		System.out.print(Low+Up);
	
		//Merge two arrays into list types
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> list2 = Arrays.asList(7,8,9,4,5,6,1,2,3);
		List<Integer> Merge = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
		System.out.println(Merge);
		
		List<Integer> Unique = Merge.stream().distinct().collect(Collectors.toList());
		System.out.println(Unique);
		
		Set<Integer> Uniq = Merge.stream().collect(Collectors.toSet());
		System.out.println(Uniq);
		
		int num = Unique.size();
		for(int i=0;i<num;i++)
		{
			System.out.println(Unique.get(i));
		}
		
		
		
		
		
	}

}
