package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Passthedataintoelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/karth/OneDrive/Desktop/Dummypassthedata.html");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("Advance");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(2000);
		driver.close();
		

	}

}
