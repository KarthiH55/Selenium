package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Faceeeee {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		WebElement A=driver.findElement(By.id("email"));
		A.sendKeys("karthikh902@gmail.com");
		WebElement B=driver.findElement(By.id("pass"));
		B.sendKeys("7032022191");
		WebElement C=driver.findElement(By.id("loginbutton"));
		C.click();
		
		Thread.sleep(2000);
		

	}

}
