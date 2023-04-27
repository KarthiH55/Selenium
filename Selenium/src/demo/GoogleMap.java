package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.google.com/maps");
	    WebElement Ele = driver.findElement(By.xpath("//img[@class='eYqqWd']"));
	    Ele.click();
	    WebElement Ele1 = driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']]"));
	    Thread.sleep(1200);
	    Ele1.sendKeys("Bangalore");
	    WebElement Ele2 = driver.findElement(By.xpath("//input[@placeholder='Choose destination...']"));
	    Ele2.sendKeys("Mysore");
	    WebElement Ele3 = driver.findElement(By.xpath("//button[@class='mL3xi']"));
	    Ele3.click(); 
	    Thread.sleep(1500);
	    

	}

}
