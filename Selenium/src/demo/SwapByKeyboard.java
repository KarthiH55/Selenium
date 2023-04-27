package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwapByKeyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("file:///C:/Users/karth/OneDrive/Desktop/SwapingbyKeyboard.html");
	  
	    WebElement ele=driver.findElement(By.xpath("//input[@id='a1']"));
	    ele.sendKeys(Keys.CONTROL+"ax");
	    WebElement late=driver.findElement(By.xpath("//input[@id='a3']"));
	   late.sendKeys(Keys.CONTROL+"v");
	    WebElement ele2=driver.findElement(By.xpath("//input[@id='a2']"));
	    ele2.sendKeys(Keys.CONTROL+"ax");
	    ele.sendKeys(Keys.CONTROL+"v");
	    late.sendKeys(Keys.CONTROL+"ax");
	    ele2.sendKeys(Keys.CONTROL+"v");
	  

	}

}
