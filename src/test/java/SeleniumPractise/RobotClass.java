package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\KRISHNA HARI\\Own Files\\Pavan Auomation\\Shift Pdfs\\Java Interview.pdf");
		
		/*
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement button = null;
		js.executeScript("arguments[0].click();",button);
		*/
		
	}

}
