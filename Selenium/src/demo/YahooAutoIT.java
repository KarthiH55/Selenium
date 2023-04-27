package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.yahoo.com");
	    Thread.sleep(3000);
	    Runtime.getRuntime().exec("");
	    

	}

}
