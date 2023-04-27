package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathMultipleAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	    WebElement Ele = driver.findElement(By.xpath("//input[@id='email' and @type='text' and @placeholder='Email address or phone number']"));
	    Ele.sendKeys("karthikh.rpcm10@gmail.com");
	    WebElement Ele1 = driver.findElement(By.xpath("//input[@id='pass' and @type='password' and @name='pass']"));
	    Ele1.sendKeys("Karthikh151998@");
	    WebElement Ele2 = driver.findElement(By.xpath("//button[@type='submit' and @name='login' and @data-testid='royal_login_button']"));
	    Ele2.click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//a[@aria-label='Friends']")).click();
	}

}
