package SeleniumPractise;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import groovyjarjarantlr4.v4.codegen.model.OutputFile;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrikenLinksDemo {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(100,100));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		
		//String Date = "12";
		String month = "August";
		String Year = "2023";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String Yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && Yr.equals(Year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* navigate to a web page
		driver.get("https://www.example.com");

		// get the current window handle
		String windowHandle = driver.getWindowHandle();

		// get the window object for the current window
		Window window = (Window) driver.switchTo().window(windowHandle);

		// set the position of the window
		window.setPosition(new Point(0, 0)); // this will move the window to the top-left corner of the screen
		
		String windowHandle = driver.getWindowHandle();
		Window window = (Window)driver.switchTo().window(windowHandle);
		window.setPosition(new Point(0,0));
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		 WebElement Ele = driver.findElement(By.tagName("a"));
		
		File src  = Ele.getScreenshotAs(OutputType.FILE);
		File file = new File("Location");
		FileUtils.copyFile(src, file);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.build().perform();
		act.scrollByAmount(100,2500);
		act.moveByOffset(0, 0);
		act.moveToElement(Ele);
		act.moveToElement(Ele);
		act.moveToElement(Ele, 0, 0);
		act.dragAndDrop(Ele,Ele);
		act.dragAndDropBy(Ele,25,45);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys(windowHandle);
		driver.switchTo().alert().getClass();
		driver.switchTo().alert().toString();
		
		
		
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement lin:allLinks)
		{
			String Href = lin.getAttribute("href");
			
			if(Href.isBlank() || Href == null)
//			URL url = new URL(Href);
//			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//			conn.connect();
			
			System.out.println(Href);
		}
		
		
		*/
	}

}
