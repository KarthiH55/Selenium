package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTraversing {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.selenium.dev/downloads/");
	   // driver.findElement(By.xpath("//p[.='Ruby']/../p[2]")).click();
	    driver.findElement(By.xpath("//a[id='navbarDropdown']")).click();
	    driver.findElement(By.xpath("//a[text()='About Selenium']")).click();

	}

}
