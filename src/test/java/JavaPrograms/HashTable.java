package JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashTable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		HashMap<Integer, String> Ht = new HashMap<Integer, String>();
		Ht.put(1, "peddireddy");
		Ht.put(2, "Annapureddy");
		Ht.put(3, "Hari");
		for(@SuppressWarnings("rawtypes") Map.Entry m:Ht.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1,"Peddireddy");
		ht.put(2, "Annapureddy");
		ht.put(3,"akhila");
		for(@SuppressWarnings("rawtypes")Map.Entry t:ht.entrySet())
		{
			System.out.println(t.getKey()+" "+t.getValue());
		}
		
		
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("peddireddy");
		ar.add("Narmada");
		ar.add("Hari");
		ar.add("vardhan");
		ar.add("reddy");
		System.out.println(ar);
		int num = ar.size();
		System.out.println(num);
		for(int i=0;i<num;i++)
		{
			System.out.println(ar.get(i));
			
		}
		
		
		

	}

}
