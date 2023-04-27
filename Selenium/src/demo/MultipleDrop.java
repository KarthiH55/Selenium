package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	 driver.get("file:///C:/Users/karth/OneDrive/Desktop/SinglewithMultipleDrop.html");
	 Thread.sleep(1000);
	 WebElement ele = driver.findElement(By.xpath("//select[@id='countryDrop']"));
	 Select drop=new Select(ele);
	 if(drop.isMultiple())
	 {
		drop.selectByIndex(1) ;
		Thread.sleep(1500);
		drop.selectByValue("6");
		Thread.sleep(2000);
		drop.selectByVisibleText("USA");
		
	 }
	 else
	 {
		 System.out.println("Iam single");
	 }

	}

}
