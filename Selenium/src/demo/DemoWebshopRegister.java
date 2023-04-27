package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWebshopRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/fiction");
		driver.findElement(By.xpath("//a[.='Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Karthik");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("H");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("karthikhkarthi0@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("151998");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("151998");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("karthikhkarthi0@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("151998");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath(("//input[@type='button' and @value='Add to cart']")[1]));
	}

}
