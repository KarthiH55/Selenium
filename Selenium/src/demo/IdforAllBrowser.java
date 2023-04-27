package demo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdforAllBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		 driver.findElement(By.id("windowButton")).click();
		 Thread.sleep(2000);
		driver.findElement(By.id("messageWindowButton")).click();
		String id = driver.getWindowHandle();
		System.out.println(id);
		Set<String> id1 = driver.getWindowHandles();
		for(String id2:id1)
		{
			System.out.println(id2);
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
