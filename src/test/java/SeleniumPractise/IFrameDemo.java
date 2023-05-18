package SeleniumPractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class IFrameDemo {

	public static void main(String[] args)
	{
		
	@SuppressWarnings("rawtypes")
	List<Comparable> Myli = new ArrayList<Comparable>();
	
	Myli.add(2500);
	Myli.add(45879);
	Myli.add(7485);
	Myli.add("Peddireddy");
	Myli.add("Annapureddy");
	
	System.out.println(Myli);
	
//	Myli.remove(1);
//	Myli.remove(3);
	Myli.add(5,"Reddy");
	System.out.println(Myli);
	
	
//	@SuppressWarnings("rawtypes")
//	Set<Comparable> set = new HashSet<Comparable>();
//	set.add(14578);
//	set.add("Annapureddy");
//	set.add("Peddireddy");
//	set.add("jammu kashmir");
//	set.add("kalapana chawala");
//	set.add(4578);
//	
//	System.out.println(set);
//	set.remove("Peddireddy");
//	System.out.println(set);
		
		for(int i= 0;i<Myli.size();i++)
		{
			System.out.println(Myli.get(i));
		}
		for(Object x:Myli)
		{
			System.out.println(x);
		}
		@SuppressWarnings("rawtypes")
		Map hm = new HashMap();
		hm.put(101,"Peddireddy");
		hm.put(102,"Reddy");
		hm.put(103,"manisha");
		
		System.out.println(hm);
		hm.remove(101);		
		System.out.println(hm);
		
	}

}
