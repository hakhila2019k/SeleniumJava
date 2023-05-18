package SeleniumPractise;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		int a=10;
		short s=20;
		long l = 1000000;
		double d = 52404146;
		
		
		
		Integer A = a;
		Short S = s;
		Long L = l;
		Double D=d;
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(l);
		System.out.println(d);
		
		System.out.println(A);
		System.out.println(S);
		System.out.println(L);
		System.out.println(D);
		
		
		String j = "250";
		String h = "450";
		
		int num = Integer.parseInt(h);
		double sum = Double.parseDouble(j);
		
		System.out.println(num);
		System.out.println(sum);
		System.out.println(num+sum);
		
		String sii = String.valueOf(sum);
		String hiii = String.valueOf(num);
		
		System.out.println(sii);
		System.out.println(hiii);
		
		System.out.println(sii+hiii);
		
		
		
		
		
	}
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		WebDriver driver = new EdgeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);
//		
//		wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("")));
		
		String URL = "https://opensource-demo.orangehrmlive.com/";
		driver.navigate().to(URL);
		
		//Bootstrap drop downs
		
		List<WebElement> drpdwn = driver.findElements(By.xpath("//*[@attribute='Value'"));
		selectDrpdwn(drpdwn,"accounts");
		
	
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		/*
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='oxd-input oxd-input--active']")));
		
		driver.manage().window().fullscreen();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		
		WebElement Ele = driver.findElement(By.name("username"));
		Ele.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		
		WebElement Sel = driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']"));
		System.out.println(Sel.isDisplayed());
		System.out.println(Sel.isEnabled());
		
		System.out.println(driver.getTitle());
		
		String exp = driver.getTitle();
		String act = "OrangeHRM";
		driver.manage().window().maximize();
		
		if(exp.equals(act))
		{
			System.out.println("Test Passed:  "+exp+" " +"  "+act);
		}
		else
		{
			System.out.println("Test Failed:  "+ exp + act);
		}
		
		System.out.println(driver.getWindowHandle());
		
		
		
		
		//Thread.sleep(2000);
		//driver.close();
		

	
	




	public static void selectDrpdwn(List<WebElement> Option,String Value) 
	{
		
		for(WebElement option:Option)
		{
			if(option.getText().equals(Value))
			{
				option.click();
				break;
				
			}
		}
}
	
}
	*/
