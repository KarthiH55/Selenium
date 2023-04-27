package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartFetchappleprice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("APPLE iPhone 14");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		 WebElement ele = driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Midnight, 128 GB)']/../following-sibling::div[1]/div[1]/div[1]/div[1]"));
		 Thread.sleep(1000);
		String text = ele.getText();
		Thread.sleep(1000);
		System.out.println(text);
	

	}

}
