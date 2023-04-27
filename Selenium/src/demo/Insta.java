package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.instagram.com/");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("karkiki10");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Karthikh151998@");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.xpath("//div[@class='_aacl _aacp _adda _aacx _aada']")).click();
	    driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div/div/div[2]/div[5]/div/a/div/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//button[.='Send Message']")).click();
	    
	    
	    /*System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("karkiki10");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Karthikh151998@");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//div[@class='/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div/div/div[2]/div[5]/div/a/div/div[2]/div/div']")).click();
	    driver.findElement(By.xpath("//button[.='Send Message']")).click();*/
	    
	}

}
