package SeleniumPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumIntrQes {

	public static void main(String[] args) throws Exception  {
		
//		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--disable-web-security=*");
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement DrpDwn = driver.findElement(By.id("input-country"));
		
		Select Drpselect = new Select((WebElement)DrpDwn);
		
		Drpselect.selectByVisibleText("United States Of Amarica");
//		Drpselect.selectByIndex(0);
//		Drpselect.selectByValue(null);
		
		
		/*
		WebElement Search  = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println(Search.isDisplayed());
		System.out.println(Search.isEnabled());
		System.out.println(Search.isSelected());
		
		// how to navigate Back and forwards 
		
		// Navigation Commands
		
		driver.get("https://www.snapdeal.com/");
		driver.get("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.navigate().
		
		// findelement and find elements in selenium.
		
		WebElement link  = driver.findElement(By.tagName("a"));
		
		//driver.findElements(By.tagName("a"));
		
		System.out.println(link);
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int num = links.size();		 
		for(int i=0;i<num;i++)
		{
			System.out.println(links.get(i));
		}
		
		
		// gettext vs get attribute 
		
		WebElement is = driver.findElement(By.id("Email"));
		String val = is.getAttribute("value");
		System.out.println("Before  Clearing value "+val);
		is.clear();
		is.sendKeys("Peddireddyhari@gmail.com");
		System.out.println("After Clearing value "+is.getText());
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://jqueryui.com/tooltip/");
//		driver.manage().window().maximize();
//		
//		
////		driver.switchTo().frame(0);
////		
////		WebElement Input  = driver.findElement(By.xpath("//input[@id='age']"));
////		
////		String ToolTip = Input.getAttribute("title");
////		
////		System.out.println(ToolTip);
////		
//		
//		
//		String Tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
//		
//		driver.findElement(By.linkText("Plugins")).sendKeys(Tab);
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		driver.get("http://demo.nopcommerce.com/");
//		
//		
//        
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		
//		driver.get("http://demo.nopcommerce.com/");
		
//		WebElement logo = driver.findElement(By.xpath());
//		
//		System.out.println(" Loaction of the logo "+ logo.getLocation());
//		System.out.println("Location Of X axis is "+ logo.getLocation().getX());
//		System.out.println("Location Of X axis is "+ logo.getLocation().getY());
//		
//		Sysologo.getSize().width();
//		logo.getSize().length();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
		driver.close();
		System.out.println("My Name is peddireddy hari .....");

	}


}
