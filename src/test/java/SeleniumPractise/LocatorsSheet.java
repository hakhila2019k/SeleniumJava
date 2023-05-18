package SeleniumPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsSheet {

	public static void main(String[] args) {
	
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//driver.findElement(By.partialLinkText("OrangeHRM")).click();
		
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();	
		driver.findElement(By.partialLinkText("Admin")).click();
		
		
		driver.findElement(By.cssSelector("TagName#ID-Value")).sendKeys("Hari vardhan");
		driver.findElement(By.cssSelector("TagName.Class_Value")).sendKeys("Hari Vardhan reddy");
		driver.findElement(By.cssSelector("TagName.Class[Attribute='Value']")).sendKeys("Peddireddy");
		driver.findElement(By.cssSelector("TagName[Attribute='Value']")).sendKeys("Annapureddy");
		driver.findElement(By.cssSelector("TagName.class-value[Attribute='Value']")).sendKeys("Annapureddy");
		driver.findElement(By.cssSelector("TagName[Attribute^='Value']")).sendKeys("Akhila");
		driver.findElement(By.cssSelector("TagName[Attribute*='Value']")).sendKeys("Reddy");
		driver.findElement(By.cssSelector("TagName[Attribute$='Value']")).sendKeys("Annam");
		driver.findElement(By.cssSelector("TagName#id-Value>ChildTagName")).sendKeys("Direct Child Getting Css selector");
		driver.findElement(By.cssSelector("TagName#id-value ChildTagName")).sendKeys("Sub Child");
		driver.findElement(By.cssSelector("TagName[Attribute= Attribute_Tag]:last-Child"))
		                                   .sendKeys("last Child in the nth child array");
		driver.findElement(By.cssSelector("TagName#id-Value SubChildTag:nth-of-type(2)")).sendKeys("");
		
		
		// Locating Elements in DOM Structure Format Document Object Model which contains Nodes To traverse
		
		//X-path Locators --> X-path has fixed Structure //TagName[@Attribute,'value']
		driver.findElement(By.xpath("//TagName[contains(text(),'Value']")).sendKeys("Annapureddy");
		driver.findElement(By.xpath("//TagName[text(),'number']")).sendKeys("Peddireddy");
		driver.findElement(By.xpath("//TagName[starts-with(@id,'value')]")).sendKeys("number");
		driver.findElement(By.xpath("Tag[@attr = 'Value']")).sendKeys("hari vardhan reddy");
		driver.findElement(By.xpath("//Tag[@att = 'value' and @att2 = 'Value2']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//Tag[@att = 'value' or @att2 = 'Value2']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//Tag[@attr = 'Valu',contains(text(),'value'))]")).sendKeys("UpperMan");
		driver.findElement(By.xpath("//TagName[@attr,'Value']//Tagname2[@attr2,'Value' and @attr3 , 'Value']"))
													.sendKeys("Kalapa");
		driver.findElement(By.xpath("//TagName[@att,'Value']")).sendKeys("friendly");
		driver.findElement(By.xpath("//*[@attr ,'Value']")).sendKeys("Under");
		driver.findElement(By.xpath("//*[@name,'Loginform']/input[1]")).sendKeys("Number");
		
		// X-Path Axes:
		
		 driver.findElement(By.xpath("//*[@attribute='Value']/ancestor::td"));
		 driver.findElement(By.xpath("//*[@attribute='Value']/parent::td"));
		 driver.findElement(By.xpath("//*[@attribute='Value']/desecendant::td"));
		 driver.findElement(By.xpath("//*[@attribute='Value']/child::td"));
		 driver.findElement(By.xpath("//*[@attribute='Value']/following::td"));
		 driver.findElement(By.xpath("//*[@attribute='Value']/preceding::td"));
		 driver.findElement(By.xpath("//*[@attribute='Value']/folowing-siblings::td"));
		 driver.findElement(By.xpath("//*[@attribute='Value']/preceding-siblings::td"));
		 driver.findElement(By.xpath("//*[@attribute='Value']/ancestor::td/child::td/following::td"));
		 
		 
		
		
		
		
		
		
		
		
		// DOM Model Sheet 
		WebElement root = driver.findElement(By.xpath("something"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
	
		WebElement shawd = (WebElement) js.executeScript("return arguments[0].shawdowRoot",root);
		
		
		
		WebElement sh1 = shawd.findElement(By.xpath("Something"));
		WebElement sh2 = sh1.findElement(By.xpath("Something"));
		
		JavascriptExecutor shawd2 = (JavascriptExecutor)driver;
		
		
	}
	static WebElement getshadow(WebElement ele ,WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement shawd = (WebElement) js.executeScript("return arguments[0].shawdowRoot",ele);
		return shawd;
	}
	
     
	

}
