package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardPageup_DownActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Actions act=new Actions(driver);
		for(int i=0;i<=5;i++)
		{
			act.sendKeys(Keys.PAGE_UP).perform();
			Thread.sleep(3000);
			
		}
		Thread.sleep(2000);
		for(int i=0;i<=5;i++)
		{
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(3000);
			
		}
		
		

	}

}
