package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
         WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
          String Att = ele.getAttribute("title");
          System.out.println(Att);
         
	}

}
